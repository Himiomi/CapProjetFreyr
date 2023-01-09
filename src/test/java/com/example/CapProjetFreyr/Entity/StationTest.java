package com.example.CapProjetFreyr.Entity;

import com.example.CapProjetFreyr.Entity.Station;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StationTest {

    @Test
    void getId() {
        Station station = new Station(1,"Station Name");
        assertEquals(station.getId(),1);
    }

    @Test
    void getName() {
        Station station = new Station(1,"Station Name");
        assertEquals(station.getName(),"Station Name");
    }

    @Test
    void setId() {
        Station station = new Station(1,"Station Name");
        station.setId(2);
        assertEquals(station.getId(),2);
    }

    @Test
    void setName() {
        Station station = new Station(1,"Station Name");
        station.setName("New Name");
        assertEquals(station.getName(),"New Name");
    }
}
