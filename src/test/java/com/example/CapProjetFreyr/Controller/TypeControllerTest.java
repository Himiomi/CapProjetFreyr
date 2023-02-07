package com.example.CapProjetFreyr.Controller;

import com.example.CapProjetFreyr.Entity.Sensor;
import com.example.CapProjetFreyr.Entity.Station;
import com.example.CapProjetFreyr.Entity.Type;
import com.example.CapProjetFreyr.Storage.DatabaseConfig;
import com.example.CapProjetFreyr.Storage.TestDatabaseConfig;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {StationController.class, DatabaseConfig.class, TestDatabaseConfig.class})
class TypeControllerTest {

    // Création d'une liste fictive de stations
    List<Type> expectedStations = new ArrayList<>(Arrays.asList(
            new Type(0, "NbrTypes_destructory"),
            new Type(1, "NbrTypes_descry"),
            new Type(2, "NbrTypes_jelutong"),
            new Type(3, "NbrTypes_laurel"),
            new Type(4, "NbrTypes_spiffiest")
    ));

    @Mock
    private DatabaseConfig databaseMock;

}
