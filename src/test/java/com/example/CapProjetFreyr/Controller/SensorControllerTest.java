package com.example.CapProjetFreyr.Controller;

import com.example.CapProjetFreyr.Entity.Sensor;
import com.example.CapProjetFreyr.Storage.DatabaseConfig;
import com.example.CapProjetFreyr.Storage.TestDatabaseConfig;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SensorController.class,DatabaseConfig.class, TestDatabaseConfig.class})
class SensorControllerTest {

    // Création d'une liste fictive de stations
    List<Sensor> expectedStations =
            new ArrayList<>(Arrays.asList(
                    new Sensor(0, new Date(),"Sensor_0",1,1),
                    new Sensor(1, new Date(),"Sensor_1",2,1),
                    new Sensor(2, new Date(),"Sensor_2",3,2),
                    new Sensor(3, new Date(),"Sensor_3",4,2),
                    new Sensor(4, new Date(),"Sensor_4",1,3),
                    new Sensor(5, new Date(),"Sensor_5",2,3),
                    new Sensor(6, new Date(),"Sensor_6",3,4),
                    new Sensor(7, new Date(),"Sensor_7",4,4)
            )
            );

    @Mock
    private DatabaseConfig databaseMock;

    SensorControllerTest() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ArrayList<Date> dateArrayList = new ArrayList<>(Arrays.asList(
                sdf.parse("2023-01-01 00:00:00"),
                sdf.parse("2023-01-01 06:00:00"),
                sdf.parse("2023-01-01 12:00:00"),
                sdf.parse("2023-01-01 18:00:00"),
                sdf.parse("2023-01-02 00:00:00"),
                sdf.parse("2023-01-02 06:00:00"),
                sdf.parse("2023-01-02 12:00:00"),
                sdf.parse("2023-01-02 18:00:00")
        ));
        for (int i = 0; i < this.expectedStations.size(); i++) {
            this.expectedStations.get(i).setAddedDate(dateArrayList.get(i));
        }
    }

    @Test
    void getAllSensors() {


    }

    @Test
    void addSensor() {

        // Création de l'instance de la classe à tester
        SensorController myClass = new SensorController(databaseMock);

        // Configuration du mock de l'objet Database pour qu'il retourne la liste de stations fictive
        when(databaseMock.getUrl()).thenReturn("jdbc:sqlite:src/test/resources/sqlite/db/test-chinook.db");

        // Appel de la méthode à tester
        String actualStations = myClass.addSensor(new Sensor(7, new Date(), "Sensor_7", 4, 4)
        );

        // Vérification que la méthode retourne bien la liste de stations fictive
        assertEquals("OK", actualStations);

    }
}
