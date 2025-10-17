package com.example.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * This checks is the city is in the list
     * @param city
     * This is a candidate city to check
     * @return true if the city is in the list and false otherwise
     */
    public boolean contains(City city) {
        return cities.contains(city);
    }
    /**
     * this provides the total number of cities in the list
     * @return
     * Return the number of cities in the list
     */
    public int size() {
        return cities.size();
    }
    /**
     * This removes a city from the list
     * @param city
     * @throws IllegalArgumentException If city is not in the list
     */
    public void remove(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

}