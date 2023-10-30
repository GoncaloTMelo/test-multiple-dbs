package tvnvs.db.multidb.service;

import tvnvs.db.multidb.data.models.AUser;
import tvnvs.db.multidb.dto.UserDto;

import java.util.List;

public interface UserService {
    List<AUser> findAll();
    AUser findUserById(Long id);

    AUser createUser(UserDto userDto);

    List<AUser> findUserByUserName(String userName);
}
