package com.example.hw_2;

import java.lang.reflect.Constructor;

public class Country {

    String name;
    int flagId;

    public Country(String name, int flagId) {
        this.name = name;
        this.flagId = flagId;
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
}
