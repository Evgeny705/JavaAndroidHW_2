package com.example.hw_2;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CountryDao {
    @Query("SELECT * FROM Country")
    public List<Country> getAll();

    @Query("SELECT * FROM Country WHERE id = :id")
    public List<Country> getCountryById(String id);

    @Insert
    public void insert(Country country);
}

