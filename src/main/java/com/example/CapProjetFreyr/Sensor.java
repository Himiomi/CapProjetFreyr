package com.example.CapProjetFreyr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
public class Sensor{
    private int id;
    private Date addedDate;
    private String name;
    private int stationId;
    private int type;
}
