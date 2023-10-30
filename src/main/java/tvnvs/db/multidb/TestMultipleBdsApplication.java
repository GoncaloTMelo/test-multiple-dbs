package tvnvs.db.multidb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {
        MongoAutoConfiguration.class,
        MongoDataAutoConfiguration.class,
         MongoRepositoriesAutoConfiguration.class,
        RedisAutoConfiguration.class
})
public class TestMultipleBdsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMultipleBdsApplication.class, args);
    }

}
