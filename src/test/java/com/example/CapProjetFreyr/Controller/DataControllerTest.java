package com.example.CapProjetFreyr.Controller;

import com.example.CapProjetFreyr.Entity.Data;
import com.example.CapProjetFreyr.Entity.Sensor;
import com.example.CapProjetFreyr.Entity.Type;
import com.example.CapProjetFreyr.Storage.DatabaseConfig;
import com.example.CapProjetFreyr.Storage.TestDatabaseConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DataController.class, DatabaseConfig.class, TestDatabaseConfig.class})
class DataControllerTest {

    @Mock
    private DataController dataController;


    // Création d'une liste fictive de stations
    List<Data> expectedStations = new ArrayList<>(Arrays.asList(
            new Data("Data1", new Date(),1,1,1,1),
            new Data("Data2", new Date(),1,1,1,1),
            new Data("Data3", new Date(),1,1,1,1),
            new Data("Data4", new Date(),1,1,1,1),
            new Data("Data5", new Date(),1,1,1,1),
            new Data("Data6", new Date(),1,1,1,1),
            new Data("Data7", new Date(),1,1,1,1),
            new Data("Data8", new Date(),1,1,1,1)
    ));

    @Mock
    private DatabaseConfig databaseMock;

    @BeforeEach
    public void init() throws ParseException {

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
            this.expectedStations.get(i).setCaptureDate(dateArrayList.get(i));
        }
    }

    @Test
    void ping() {
        DataController myClass = new DataController(databaseMock);
        String result = myClass.ping();
        assertEquals("pong", result);
    }

}
