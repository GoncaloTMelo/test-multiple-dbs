package tvnvs.db.multidb.data.repository;

import org.springframework.data.repository.CrudRepository;
import tvnvs.db.multidb.data.models.AUser;

import java.util.List;

public interface GeneralUserRepository extends CrudRepository<AUser, Long> {


    List<AUser> findAUserByUserNameIsLikeIgnoreCase(String userName);
}
