package com.example.hw_2;

import android.app.Application;

import androidx.room.Room;

public class App extends Application {
    public static App instance;
    private static MyRoomDatabase database;
    @Override
    public void onCreate() {
        super.onCreate();

        database = Room
                .databaseBuilder(this, MyRoomDatabase.class, "database")
                .allowMainThreadQueries()
                .build();
    }

    public App getInstance(){
        return instance;
    }
    public static MyRoomDatabase getDatabase() {
        return database;
    }


}
