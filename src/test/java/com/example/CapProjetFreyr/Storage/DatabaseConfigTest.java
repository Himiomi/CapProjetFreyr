package com.example.CapProjetFreyr.Storage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConfigTest {

    @Test
    void getUrl() {
        DatabaseConfig databaseConfig = new DatabaseConfig();
        assertEquals(databaseConfig.getUrl(),"jdbc:sqlite:src/main/resources/sqlite/db/chinook.db");
    }
}
