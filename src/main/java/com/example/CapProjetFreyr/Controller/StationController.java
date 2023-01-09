package com.example.CapProjetFreyr.Controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.example.CapProjetFreyr.Storage.Database;
import com.example.CapProjetFreyr.Entity.Sensor;
import com.example.CapProjetFreyr.Entity.Station;
import com.example.CapProjetFreyr.Storage.DatabaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StationController {

    private final DatabaseConfig databaseConfig;


    public StationController(@Autowired DatabaseConfig databaseConfig) {
        this.databaseConfig = databaseConfig;
    }

    @CrossOrigin(origins = "http://localhost:4200")


    @GetMapping("/station")
    public List<Station> getAllStations(){
        List mylist = (List) Database.getStations(databaseConfig.getUrl());
        return mylist;
    }

    @GetMapping("/station/{stationId}")
    public Station getStationWithId(@PathVariable Integer stationId){
        //Returns hardcoded data, a real world application would return from the database
        ArrayList<Station> test = new ArrayList<Station>(getAllStations());
        test.spliterator();
        return test.get(stationId);
    }

    @PostMapping("/station/newstation")
    public String addStation(@RequestBody Station newstation){
        //Just has a Sysout stmt, a real world application would save this record to the database
        System.out.println("Saving station information");
        return "OK";
    }
}
