package com.example.ca1_2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PortTest {

    private Port p1, p2, p3, p4;
    @BeforeEach
    void setUp() {
        p1 = new Port("A", 1, "China");
        p2 = new Port("b", 22, "America");
        p3 = new Port("c", 333, "Ireland");
        p4 = new Port("D", 4444,"Sweden");
    }

    @AfterEach
    void tearDown() {
        p1=p2=p3=p4=null;
    }

    @Test
    void getters(){
        assertEquals("A", p1.getName());
        assertEquals(22, p2.getIntCode());
        assertEquals("Ireland", p3.getCountry());
    }

    @Test
    void setters(){
        assertEquals("D", p4.getName());
        p4.setName("d");
        assertEquals("d", p4.getName());

        assertEquals(1, p1.getIntCode());
        p1.setIntCode(01);
        assertEquals(1, p1.getIntCode());

        assertEquals("America", p2.getCountry());
        p2.setCountry("Canada");
        assertEquals("Canada", p2.getCountry());
    }

//    @Test
//    void toStringTest(){
//        String toStringContains = p4.toString();
//        assertTrue(toStringContains.contains("name='" + p4.getName()));
//        assertTrue(toStringContains.contains( "intCode=" + p4.getIntCode()));
//        assertTrue(toStringContains.contains( "country=" + p4.getCountry()));
//    }
//TODO fix tostring test

}