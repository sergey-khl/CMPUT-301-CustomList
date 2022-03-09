package com.example.simpleparadox.listycity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;


public class ExampleUnitTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void hasCityTest() {
        City city = new City("something", "nowhere");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }
}