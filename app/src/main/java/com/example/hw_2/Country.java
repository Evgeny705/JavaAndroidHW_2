package com.example.hw_2;

import java.io.Serializable;
import java.lang.reflect.Constructor;

public class Country implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int flagId;
    String flagURL;
    String capital;
    int area;

    public Country(String name, int flagId) {
        this.name = name;
        this.flagId = flagId;
    }

    public Country(String name, String flagURL, String capital, int area) {
        this.name = name;
        this.flagURL = flagURL;
        this.capital = capital;
        this.area = area;
    }

    public Country(String name, int flagId, String capital, int area) {
        this.name = name;
        this.flagId = flagId;
        this.capital = capital;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlagId() {
        return flagId;
    }

    public void setFlagId(int flagId) {
        this.flagId = flagId;
    }

    public String getFlagURL() {
        return flagURL;
    }

    public void setFlagURL(String flagURL) {
        this.flagURL = flagURL;
    }

    public String getCapital() { return capital; }

    public void setCapital(String capital) { this.capital = capital; }

    public int getArea() { return area; }

    public void setArea(int area) { this.area = area; }

}
