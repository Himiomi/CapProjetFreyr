package com.example.CapProjetFreyr;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
public class DataController {

    @CrossOrigin(origins = "http://localhost:4200")

    @GetMapping("/data")
    public List<Data> getAllData(){
        List<Data> mylist = (List<Data>) Database.getData();
        System.out.println(mylist.get(0).getCaptureDate());
        System.out.println(mylist.get(1).getCaptureDate());
        return mylist;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/data/{sensorsId}")
    public List<Data> getDataWithId(@PathVariable Integer sensorsId){
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
