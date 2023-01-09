package com.example.CapProjetFreyr.Storage;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Configuration
@Component
public class DatabaseConfig {

    public String getUrl() {
        return "jdbc:sqlite:src/main/resources/sqlite/db/chinook.db";
    }
}
