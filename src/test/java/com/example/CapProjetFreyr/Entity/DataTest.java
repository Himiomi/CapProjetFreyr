package com.example.CapProjetFreyr.Entity;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    @Test
    void getName() {
        Data data = new Data("Data1",new Date(),1,1,1,1);
        assertEquals(data.getName(),"Data1");
    }

    @Test
    void getCaptureDate() {
        Data data = new Data("Data1",new Date(),1,1,1,1);
        assertEquals(data.getCaptureDate(),new Date());
    }

    @Test
    void getSensorsId() {
        Data data = new Data("Data1",new Date(),1,1,1,1);
        assertEquals(data.getSensorsId(),1);
    }

    @Test
    void getStationId() {
        Data data = new Data("Data1",new Date(),1,1,1,1);
        assertEquals(data.getStationId(),1);
    }

    @Test
    void getType() {
        Data data = new Data("Data1",new Date(),1,1,1,1);
        assertEquals(data.getType(),1);
    }

    @Test
    void getValue() {
        Data data = new Data("Data1",new Date(),1,1,1,1);
        assertEquals(data.getValue(),1);
    }

    @Test
    void setName() {
        Data data = new Data("Data1",new Date(),1,1,1,1);
        data.setName("Nouveau Nom");
        assertEquals(data.getName(),"Nouveau Nom");
    }

    @Test
    void setCaptureDate() {
        Data data = new Data("Data1",new Date(),1,1,1,1);
        data.setCaptureDate(new Date(2));
        assertEquals(data.getCaptureDate(),new Date(2));
    }

    @Test
    void setSensorsId() {
        Data data = new Data("Data1",new Date(),1,1,1,1);
        data.setSensorsId(2);
        assertEquals(data.getSensorsId(),2);
    }

    @Test
    void setStationId() {
        Data data = new Data("Data1",new Date(),1,1,1,1);
        data.setStationId(2);
        assertEquals(data.getStationId(),2);
    }

    @Test
    void setType() {
        Data data = new Data("Data1",new Date(),1,1,1,1);
        data.setType(2);
        assertEquals(data.getType(),2);
    }

    @Test
    void setValue() {
        Data data = new Data("Data1",new Date(),1,1,1,1);
        data.setValue(2);
        assertEquals(data.getValue(),2);
    }
}
