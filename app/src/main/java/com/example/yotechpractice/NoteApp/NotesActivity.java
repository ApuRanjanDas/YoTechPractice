package com.example.yotechpractice.NoteApp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.yotechpractice.NoteApp.Adapter.NoteListAdapter;
import com.example.yotechpractice.NoteApp.Database.RoomDB;
import com.example.yotechpractice.NoteApp.Interface.NotesClickListener;
import com.example.yotechpractice.NoteApp.Model.Notes;
import com.example.yotechpractice.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class NotesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    NoteListAdapter noteListAdapter;
    RoomDB database;
    //List<Notes> notes = new ArrayList<>();
    List<Notes> contactModelList = new ArrayList<>();
    FloatingActionButton fabBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        recyclerView = findViewById(R.id.noteRv);
        fabBtn = findViewById(R.id.addBtn);

        Log.d("error", "onCreate: oncraete");

        database = RoomDB.getInstance(this);

        contactModelList = database.mainDAO().getAll();

        updateRecycle(contactModelList);

        fabBtn.setOnClickListener(v -> {
            Intent intent = new Intent(NotesActivity.this, NoteTakeActivity.class);
            startActivityForResult(intent, 101);
        });

    }//On Create

    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 101){
            if (resultCode == Activity.RESULT_OK){
                assert data != null;
                Notes new_notes = (Notes) data.getSerializableExtra("note");
                database.mainDAO().insert(new_notes);
                contactModelList.clear();
                contactModelList.addAll(database.mainDAO().getAll());
                noteListAdapter.notifyDataSetChanged();
            }
        } else if (requestCode == 102){ //update and edit the notes on click on notes
            if (resultCode == Activity.RESULT_OK){
                assert data != null;
                Notes new_notes = (Notes) data.getSerializableExtra("note");
                database.mainDAO().update(new_notes.getID(), new_notes.getTitle(), new_notes.getNotes());
                contactModelList.clear();
                contactModelList.addAll(database.mainDAO().getAll());
                noteListAdapter.notifyDataSetChanged();
            }
        }
    }

    public void updateRecycle(List<Notes> notes){
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL));
        noteListAdapter = new NoteListAdapter(NotesActivity.this, notes, notesClickListener);
        recyclerView.setAdapter(noteListAdapter);

        Log.d("error", "updateRecycle: onCreate");
    }
    private final NotesClickListener notesClickListener = new NotesClickListener() {
        @Override
        public void onClick(Notes notes) {

            Intent intent = new Intent(NotesActivity.this, NoteTakeActivity.class);
            intent.putExtra("old_notes",notes);
            startActivityForResult(intent, 102);

        }

        @Override
        public void onLongPress(Notes notes, CardView cardView) {

        }
    };
}