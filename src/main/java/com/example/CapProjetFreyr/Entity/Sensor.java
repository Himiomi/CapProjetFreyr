package com.example.CapProjetFreyr.Entity;

import io.micrometer.core.annotation.Timed;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Sensor{
    private int id;
    private Date addedDate;
    private String name;
    private int stationId;
    private int type;
}
