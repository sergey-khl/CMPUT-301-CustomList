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

    @Test
    public void delCityTest() {
        City city = new City("something", "nowhere");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.delCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void countCityTest() {
        int count = list.getCount();
        City city1 = new City("something1", "nowhere1");
        City city2 = new City("something2", "nowhere2");
        list.addCity(city1);
        list.addCity(city2);
        assertEquals(list.countCity(), count + 2);
    }
}