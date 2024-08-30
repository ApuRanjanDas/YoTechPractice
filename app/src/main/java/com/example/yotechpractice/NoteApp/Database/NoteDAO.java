package com.example.yotechpractice.NoteApp.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.yotechpractice.NoteApp.Model.Notes;

import java.util.List;

@Dao
public interface NoteDAO {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Notes notes);

    @Delete
    void delete(Notes notes);

    @Query("SELECT * FROM www ORDER BY id DESC")
    List<Notes> getAll();

    @Query("UPDATE www SET title = :title, notes = :notes WHERE ID = :id")
    void update(int id, String title, String notes);





}
