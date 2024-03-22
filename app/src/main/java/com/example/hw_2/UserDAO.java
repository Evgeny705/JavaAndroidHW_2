package com.example.hw_2;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM Country")
    public List<Country> getAll();

    @Insert
    public void insert(Country country);
}

