package com.example.CapProjetFreyr.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Data{
    private String name;
    private Date captureDate;
    private int sensorsId;
    private int stationId;
    private int type;
    private int value;

}

