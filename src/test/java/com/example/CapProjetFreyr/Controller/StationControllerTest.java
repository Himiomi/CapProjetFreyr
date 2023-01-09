package com.example.CapProjetFreyr.Controller;

import com.example.CapProjetFreyr.Entity.Station;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {StationController.class,DatabaseConfig.class,TestDatabaseConfig.class})
class StationControllerTest {

    // Création d'une liste fictive de stations
    List<Station> expectedStations = new ArrayList<>(Arrays.asList(
            new Station(0, "Station_circumstantiated"),
            new Station(1, "Station_assessee"),
            new Station(2, "Station_reflexible"),
            new Station(3, "Station_preterroyal"),
            new Station(4, "Station_frilled"),
            new Station(5, "Station_harmonies"))
    );

    @Mock
    private DatabaseConfig databaseMock;

    @Test
    public void testGetAllStations() {
        // Création de l'instance de la classe à tester
        StationController myClass = new StationController(databaseMock);
        // Configuration du mock de l'objet Database pour qu'il retourne la liste de stations fictive
        when(databaseMock.getUrl()).thenReturn("jdbc:sqlite:src/test/resources/sqlite/db/test-chinook.db");

        // Appel de la méthode à tester
        List<Station> actualStations = myClass.getAllStations();

        // Vérification que la méthode retourne bien la liste de stations fictive
        assertEquals(expectedStations.size(), actualStations.size());
        assertEquals(expectedStations.get(0).toString(),actualStations.get(0).toString());
    }

    @Test
    void getStationWithId() {

        // Création de l'instance de la classe à tester
        StationController myClass = new StationController(databaseMock);

        // Configuration du mock de l'objet Database pour qu'il retourne la liste de stations fictive
        when(databaseMock.getUrl()).thenReturn("jdbc:sqlite:src/test/resources/sqlite/db/test-chinook.db");

        // Appel de la méthode à tester
        Station actualStations = myClass.getStationWithId(1);

        // Vérification que la méthode retourne bien la liste de stations fictive
        assertEquals(expectedStations.get(1).toString(), actualStations.toString());
    }

    @Test
    void addStation() {

        // Création de l'instance de la classe à tester
        StationController myClass = new StationController(databaseMock);

        // Configuration du mock de l'objet Database pour qu'il retourne la liste de stations fictive
        when(databaseMock.getUrl()).thenReturn("jdbc:sqlite:src/test/resources/sqlite/db/test-chinook.db");

        // Appel de la méthode à tester
        String actualStations = myClass.addStation(new Station(1,"nouveau"));

        // Vérification que la méthode retourne bien la liste de stations fictive
        assertEquals("OK", actualStations);
    }
}
