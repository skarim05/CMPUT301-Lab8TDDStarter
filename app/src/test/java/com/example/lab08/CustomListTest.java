package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        list.deleteCity(calgary);
        // This will fail initially because deleteCity() doesn't exist
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.countCity() == 1);
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        assertTrue(list.countCity() == 2);
        list.deleteCity(calgary);
        list.deleteCity(edmonton);
        assertTrue(list.countCity() == 0);
    }
}
