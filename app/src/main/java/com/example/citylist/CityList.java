package com.example.citylist;

import java.util.ArrayList;
import java.util.Collections;
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
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list of cities
     */
    public List<City> getCities(int sort) {
        List<City> cityList = cities;

        if(sort == 1){
            /** Sort by City name */
            Collections.sort(cityList);
        }
        else
        {
            /** Sort by Province name */
            Collections.sort(cityList, new SortByProvince());
        }
        return cityList;
    }

    /** This is to delete city */
    public void delete(City city)
    {

        if(!cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /** this is to count city in the list */
    public int count()
    {
        return cities.size();
    }
}
