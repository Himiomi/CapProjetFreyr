package com.example.CapProjetFreyr.Entity;

import lombok.Data;

import java.util.List;

@Data
public class StationListen {
    private String mac;
    private List<Sensor> sensor;
}
