package com.example.CapProjetFreyr.Controller;

import com.example.CapProjetFreyr.Entity.PayloadSensor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class ListenController {

    @PostMapping
    public ResponseEntity<Object> receiveData(@RequestBody PayloadSensor payloadSensor) {
        System.out.println(payloadSensor);
        return ResponseEntity.ok().build();
    }

}

