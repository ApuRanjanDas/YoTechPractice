package com.example.yotechpractice.retrofitapicall;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yotechpractice.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiNoteActivity extends AppCompatActivity {

    public static String api = "https://dev.cloud-valtapi.com/";
    List<userModel> allUsersList;
    RecyclerView rcvMainID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api_note);

        rcvMainID = findViewById(R.id.rcvMainID);
        rcvMainID.setLayoutManager(new LinearLayoutManager(this));

        RetrofitInstance.getInstance().apiInterface.getUsers().enqueue(new Callback<List<userModel>>() {
            @Override
            public void onResponse(Call<List<userModel>> call, Response<List<userModel>> response) {

                allUsersList = response.body();
                rcvMainID.setAdapter(new userAdapter(ApiNoteActivity.this,allUsersList));


            }

            @Override
            public void onFailure(Call<List<userModel>> call, Throwable t) {
                Log.e("api", "onFailure: "+t.getLocalizedMessage() );
            }
        });

    }
}