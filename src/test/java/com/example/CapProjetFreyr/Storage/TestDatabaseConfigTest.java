package com.example.CapProjetFreyr.Storage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDatabaseConfigTest {

    @Test
    void getUrl() {
        TestDatabaseConfig testDatabaseConfig = new TestDatabaseConfig();
        assertEquals(testDatabaseConfig.getUrl(),"jdbc:sqlite:src/test/resources/sqlite/db/test-chinook.db");
    }
}
