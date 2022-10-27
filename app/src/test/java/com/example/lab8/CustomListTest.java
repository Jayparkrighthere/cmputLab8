package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City newCity = new City("Estevan", "SK");
        list.addCity(newCity);
        assertEquals(list.getCount(),listSize + 1);
        assertTrue(list.hasCity(newCity));
    }
    @Test
    @DisplayName("Test to see if delete actually removes the city from the list")
    void testDelete(){
        list = MockCityList();
        int listSize = list.getCount();
        City newCity = new City("Estevan", "SK");
        list.addCity(newCity);
        assertEquals(list.getCount(),listSize + 1);

        list.delete(newCity);
        assertEquals(list.getCount(),0);
    }


}
