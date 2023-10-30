package tvnvs.db.multidb.service.impl;

import org.apache.catalina.User;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import tvnvs.db.multidb.data.models.AUser;
import tvnvs.db.multidb.data.repository.GeneralUserRepository;
import tvnvs.db.multidb.dto.UserDto;
import tvnvs.db.multidb.service.UserService;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserServiceImpl implements UserService {

    private final GeneralUserRepository userRepository;

    public UserServiceImpl(GeneralUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<AUser> findAll() {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(userRepository.findAll().iterator(), Spliterator.ORDERED), false)
                .collect(Collectors.toList());

    }

    @Override
    public AUser findUserById(Long id) {
        return userRepository.findById(id).stream().findFirst().orElse(null);
    }

    @Override
    public AUser createUser(UserDto userDto) {
        return userRepository.save(AUser.builder().id(RandomUtils.nextLong()).userName(userDto.getName()).build());
    }

    @Override
    public List<AUser> findUserByUserName(String userName) {
        return userRepository.findAUserByUserNameIsLikeIgnoreCase(userName);
    }
}
