package tvnvs.db.multidb.data.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import tvnvs.db.multidb.data.models.AUser;
import tvnvs.db.multidb.data.repository.GeneralUserRepository;

public interface UserRepository extends GeneralUserRepository, MongoRepository<AUser, Long> {}
