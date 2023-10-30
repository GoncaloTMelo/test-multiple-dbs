package tvnvs.db.multidb.config;


import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Collections;

@Profile("mongo")
@Configuration
@EnableMongoRepositories(basePackages = "tvnvs.db.multidb.data.repository")
public class MongoConfiguration extends AbstractMongoClientConfiguration {
    @Override
    protected String getDatabaseName() {
        return "test";
    }

    @Override
    protected void configureClientSettings(MongoClientSettings.Builder builder) {
        builder
                .credential(MongoCredential.createCredential("user", "test", "password123".toCharArray()))
                .applyToClusterSettings(settings -> {
                    settings.hosts(Collections.singletonList(new ServerAddress("localhost", Integer.parseInt("27017"))));

                });
    }

}
