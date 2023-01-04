package com.example.CapProjetFreyr;

import java.sql.*;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class SensorController {

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/sensor")
    public List getAllSensors(){

        List mylist = (List) Database.getSensors();
        return mylist;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/person/newsensor")
    public void addSensor(@RequestBody Sensor sensor){
        //Just has a Sysout stmt, a real world application would save this record to the database
        System.out.println("Saving sensor information");

    }
}
