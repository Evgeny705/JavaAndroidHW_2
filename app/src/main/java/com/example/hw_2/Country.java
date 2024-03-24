package com.example.hw_2;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.lang.reflect.Constructor;

@Entity
public class Country implements Serializable {
    private static final long serialVersionUID = 1L;

    @NonNull
    @PrimaryKey
    String id;
    String name;
    String flagURL;
    String capital;
    int area;

    public Country(String id, String name, String flagURL, String capital, int area) {
        this.id = id;
        this.name = name;
        this.flagURL = flagURL;
        this.capital = capital;
        this.area = area;
    }

    @NonNull
    public String getId() { return id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
