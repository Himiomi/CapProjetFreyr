package com.example.CapProjetFreyr.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeTest {

    @Test
    void construct(){
        Type type = new Type(1,"Nom Type");
        assertEquals(type.toString(),(new Type(1,"Nom Type")).toString());
    }

    @Test
    void getId() {
        Type type = new Type(1,"Nom Type");
        assertEquals(type.getId(),1);
    }

    @Test
    void getName() {
        Type type = new Type(1,"Nom Type");
        assertEquals(type.getName(),"Nom Type");
    }

    @Test
    void setId() {
        Type type = new Type(2,"Nom Type");
        type.setId(3);
        assertEquals(type.getId(),3);
    }

    @Test
    void setName() {
        Type type = new Type(1,"Nom Type");
        type.setName("Nouveau Nom");
        assertEquals(type.getName(),"Nouveau Nom");
    }
}
