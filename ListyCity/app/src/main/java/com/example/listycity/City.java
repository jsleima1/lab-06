package com.example.listycity;

/**
 * This class represents a city and its province.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCityName() {
        return this.city;
    }

    public String getProvinceName() {
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());

    }
    @Override
    public boolean equals(Object o) {
        if(this == o) return true; //same instance
        if(o == null || getClass() != o.getClass()) return false; //null or different class
        City city = (City) o;
        return this.city.equals(city.getCityName()) && this.province.equals(city.getProvinceName());
        //the city and province must be the same
    }

    /**
     * This provides a hash code for the city
     * @return the hash code for an object/city
     */
    @Override
    public int hashCode() {
        return (this.city + this.province).hashCode();
    }
    @Override
    public String toString() {
        return this.city + ", " + this.province;

    }
}