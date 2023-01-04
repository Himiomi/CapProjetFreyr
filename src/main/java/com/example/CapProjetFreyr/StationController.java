package com.example.CapProjetFreyr;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class StationController {

    @CrossOrigin(origins = "http://localhost:4200")

    @GetMapping("/station")
    public List<Station> getAllStations(){
        List mylist = (List) Database.getStations();
        return mylist;
    }

    @GetMapping("/station/{stationId}")
    public Station getStationWithId(@PathVariable Integer stationId){
        //Returns hardcoded data, a real world application would return from the database
        ArrayList<Station> test = new ArrayList<Station>(getAllStations());
        test.spliterator();
        return test.get(stationId - 1);
    }

    @GetMapping("/station/{stationId}/{sensorId}")
    public Sensor getSensorWithStationId(@PathVariable Integer stationId, Integer sensorId){
        //Returns hardcoded data, a real world application would return from the database
        return new Sensor(3, new Date(System.currentTimeMillis()), "station1", 1, 1);
    }

    @PostMapping("/station/newstation")
    public void addStation(@RequestBody Station newstation){
        //Just has a Sysout stmt, a real world application would save this record to the database
        System.out.println("Saving station information");

    }
}
