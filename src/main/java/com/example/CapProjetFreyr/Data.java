package com.example.CapProjetFreyr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Data{
    private String name;
    private Date captureDate;
    private int sensorsId;
    private int stationId;
    private int type;
    private int value;

}

