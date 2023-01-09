package com.example.CapProjetFreyr.Entity;

import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class SensorTest {

    @Test
    void getId() {
        Sensor sensor = new Sensor(1,new Date(2),"Nom Station",1,1);
        assertEquals(sensor.getId(),1);
    }

    @Test
    void getAddedDate() {
        Sensor sensor = new Sensor(1,new Date(2),"Nom Station",1,1);
        assertEquals(sensor.getAddedDate(),new Date(2));
    }

    @Test
    void getName() {
        Sensor sensor = new Sensor(1,new Date(2),"Nom Station",1,1);
        assertEquals(sensor.getName(),"Nom Station");
    }

    @Test
    void getStationId() {
        Sensor sensor = new Sensor(1,new Date(2),"Nom Station",1,1);
        assertEquals(sensor.getStationId(),1);
    }

    @Test
    void getType() {
        Sensor sensor = new Sensor(1,new Date(2),"Nom Station",1,1);
        assertEquals(sensor.getType(),1);
    }

    @Test
    void setId() {
        Sensor sensor = new Sensor(1,new Date(2),"Nom Station",1,1);
        sensor.setId(2);
        assertEquals(sensor.getId(),2);
    }

    @Test
    void setAddedDate() {
        Sensor sensor = new Sensor(1,new Date(2),"Nom Station",1,1);
        sensor.setAddedDate(new Date(3));
        assertEquals(sensor.getAddedDate(),new Date(3));
    }

    @Test
    void setName() {
        Sensor sensor = new Sensor(1,new Date(2),"Nom Station",1,1);
        sensor.setName("Nouveau Nom");
        assertEquals(sensor.getName(),"Nouveau Nom");
    }

    @Test
    void setStationId() {
        Sensor sensor = new Sensor(1,new Date(2),"Nom Station",1,1);
        sensor.setStationId(2);
        assertEquals(sensor.getStationId(),2);
    }

    @Test
    void setType() {
        Sensor sensor = new Sensor(1,new Date(2),"Nom Station",1,1);
        sensor.setType(2);
        assertEquals(sensor.getType(),2);
    }
}
