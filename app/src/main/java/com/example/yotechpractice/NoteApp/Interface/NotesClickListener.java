package com.example.yotechpractice.NoteApp.Interface;

import androidx.cardview.widget.CardView;

import com.example.yotechpractice.NoteApp.Model.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongPress(Notes notes, CardView cardView);
}
