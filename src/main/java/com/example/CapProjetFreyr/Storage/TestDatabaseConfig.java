package com.example.CapProjetFreyr.Storage;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
@Service
@Profile("test")
@NoArgsConstructor
public class TestDatabaseConfig extends DatabaseConfig {

    @Override
    public String getUrl() {
        return "jdbc:sqlite:src/test/resources/sqlite/db/test-chinook.db";
    }
}
