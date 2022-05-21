package com.example.citylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     * @param city
     *      This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This delete a city to the list if that city  exist
     * @param city
     *      This is the city to delete
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }
    /**
     * This returns total number of  cities
     * @return
     */

    public int count()
    {
        return cities.size();
    }
    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list of cities
     *      if parameter equal 1 then according to city name otherwise provincename
     */
    public List<City> getCities(int param) {
        List<City> cityList = cities;
        if(param==1)
        {
            Collections.sort(cityList);
        }
        else
        {
            cities.sort(Comparator.comparing(City::getProvinceName));

        }

        return cityList;
    }
}
