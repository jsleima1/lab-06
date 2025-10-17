package com.example.listycity;
import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }
    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }
    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }
    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);
        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }
    @Test
    void testContains() {
        CityList cityList = mockCityList();
        City presentCity = mockCity();
        assertTrue(cityList.contains(presentCity)); //city is present
        City absentCity = new City("Regina", "Saskatchewan");
        assertFalse(cityList.contains(absentCity)); //city is not present
    }
    @Test
    void testSize() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.size());
    }
    @Test
    void testRemove() {
        CityList cityList = mockCityList();
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.size());
        cityList.remove(city);
        assertEquals(1, cityList.size());
        assertFalse(cityList.contains(city));//city is not present
    }
    @Test
    void testRemoveThrowsException() {
        CityList cityList = mockCityList();
        City city = new City("Regina", "Saskatchewan");
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.remove(city);
        }); // attempting to remove an absent city throws an exception
    }


}
