package com.example.yotechpractice.NoteApp;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_take);

        titleEditText = findViewById(R.id.titleEdt);
        noteEditText = findViewById(R.id.noteEdt);

        Log.d("error", "onCreate: oncraete 2");

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = titleEditText.getText().toString();
                String description = noteEditText.getText().toString();

                if (description.isEmpty()){
                    Toast.makeText(NoteTakeActivity.this,"Please enter the description!",Toast.LENGTH_SHORT);
                    return;
                }
                SimpleDateFormat format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
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