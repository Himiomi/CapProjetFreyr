package com.example.CapProjetFreyr.Controller;

import com.example.CapProjetFreyr.Storage.Database;
import com.example.CapProjetFreyr.Entity.Data;
import com.example.CapProjetFreyr.Storage.DatabaseConfig;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DataController {

    private DatabaseConfig databaseConfig;
    public DataController(DatabaseConfig databaseMock) {
        this.databaseConfig=databaseMock;
    }

    @CrossOrigin(origins = "http://localhost:4200")

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @GetMapping("/data")
    public List<Data> getAllData() throws ParseException {
        List<Data> mylist = Database.getData(databaseConfig.getUrl());
        System.out.println(mylist.get(0).getCaptureDate());
        System.out.println(mylist.get(1).getCaptureDate());
        return mylist;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/data/{sensorsId}")
    public List<Data> getDataWithId(@PathVariable Integer sensorsId) throws ParseException {
        ArrayList<Data> testdata = new ArrayList<Data>(getAllData());
        ArrayList<Data> testdata2 = new ArrayList<Data>();
        for(Data i : testdata){
            if(i.getSensorsId() == sensorsId){
                testdata2.add(i);
            }
        }
        return testdata2;
    }
}
