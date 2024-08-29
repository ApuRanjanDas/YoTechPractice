package com.example.yotechpractice.retrofitapicall;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yotechpractice.R;

import java.util.List;

public class userAdapter extends RecyclerView.Adapter<userAdapter.userHolder> {
    ApiNoteActivity apiNoteActivity;
    List<userModel> allUsersList;
    public userAdapter(ApiNoteActivity apiNoteActivity, List<userModel> allUsersList) {
        this.apiNoteActivity = apiNoteActivity;
        this.allUsersList = allUsersList;
    }

    @NonNull
    @Override
    public userHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new userHolder(LayoutInflater.from(apiNoteActivity).inflate(R.layout.api_item_user, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull userHolder holder, int position) {
        holder.itemTextView.setText(allUsersList.get(position).getDevice_id());
    }

    @Override
    public int getItemCount() {
        return allUsersList.size();
    }

    class userHolder extends RecyclerView.ViewHolder {
        TextView itemTextView;
        public userHolder(@NonNull View itemView) {
            super(itemView);
            itemTextView = itemView.findViewById(R.id.itemTxtID);
        }
    }

}
