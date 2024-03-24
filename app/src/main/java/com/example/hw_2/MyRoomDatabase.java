package com.example.hw_2;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Country.class}, version = 1)
public abstract class MyRoomDatabase extends RoomDatabase {
    public abstract CountryDao countryDao();
}
