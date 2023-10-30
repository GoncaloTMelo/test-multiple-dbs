package tvnvs.db.multidb.data.repository.redis;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tvnvs.db.multidb.data.models.AUser;
import tvnvs.db.multidb.data.repository.GeneralUserRepository;

@Repository
public interface UserRepository extends GeneralUserRepository {}
