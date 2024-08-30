package com.example.yotechpractice.NoteApp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.NoteApp.Model.Notes;
import com.example.yotechpractice.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class NoteTakeActivity extends AppCompatActivity {

    EditText titleEditText, noteEditText;
    ImageView saveBtn;
    Notes notes;
    boolean isOldNotes = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_take);

        titleEditText = findViewById(R.id.titleEdt);
        noteEditText = findViewById(R.id.noteEdt);
        saveBtn = findViewById(R.id.savebtn);

        notes = new Notes();

        try {
            notes = (Notes) getIntent().getSerializableExtra("old_notes");
            titleEditText.setText(notes.getTitle());
            noteEditText.setText(notes.getNotes());
            isOldNotes = true;
        }catch (Exception e){
            e.printStackTrace();
        }

        //Log.d("error", "onCreate: oncraete 2");

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!isOldNotes){
                    notes = new Notes();
                }

                String title = titleEditText.getText().toString();
                String description = noteEditText.getText().toString();

                if (description.isEmpty()){
                    Toast.makeText(NoteTakeActivity.this,"Please enter the description!",Toast.LENGTH_SHORT).show();
                    return;
                }
                @SuppressLint("SimpleDateFormat") SimpleDateFormat format = new SimpleDateFormat("E, d MMM yyyy HH:mm a");
                Date date = new Date();

                notes.setTitle(title);
                notes.setNotes(description);
                notes.setDate(format.format(date));

                Intent intent = new Intent();
                intent.putExtra("note",notes);
                setResult(Activity.RESULT_OK,intent);
                finish();

            }
        });
    }
}