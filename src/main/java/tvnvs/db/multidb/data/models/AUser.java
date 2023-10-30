package tvnvs.db.multidb.data.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.redis.core.RedisHash;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("User")
public class AUser {
    private Long id;
    private String userName;


}
