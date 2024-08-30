package com.example.yotechpractice.NoteApp.Database;

import android.content.Context;
import android.util.Log;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.yotechpractice.NoteApp.Model.Notes;

@Database(entities = Notes.class, version = 3, exportSchema = false)
public abstract class RoomDB extends RoomDatabase {

    private static RoomDB database;
    private static String DATABASE_NAME ="NoteApp";
    public synchronized static RoomDB getInstance(Context context){
        if (database == null){
            database = Room.databaseBuilder(context.getApplicationContext(),
                    RoomDB.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();

            Log.d("error", "getInstance: RoomDB"+database);
        }
        return database;
    }

    public abstract NoteDAO mainDAO();


}
