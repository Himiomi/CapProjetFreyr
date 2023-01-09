package com.example.CapProjetFreyr.Controller;

import java.util.List;

import com.example.CapProjetFreyr.Storage.Database;
import com.example.CapProjetFreyr.Entity.Sensor;
import com.example.CapProjetFreyr.Storage.DatabaseConfig;
import org.springframework.web.bind.annotation.*;

@RestController
public class SensorController {

    private DatabaseConfig databaseMock;
    public SensorController(DatabaseConfig databaseMock) {
        this.databaseMock=databaseMock;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/sensor")
    public List<Sensor> getAllSensors(){

        return Database.getSensors(this.databaseMock.getUrl());
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/person/newsensor")
    public String addSensor(@RequestBody Sensor sensor){
        //Just has a Sysout stmt, a real world application would save this record to the database
        System.out.println("Saving sensor information");
        return "OK";
    }
}
