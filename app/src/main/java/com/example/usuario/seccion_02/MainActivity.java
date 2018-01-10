package com.example.usuario.seccion_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://samples.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WatherServices service = retrofit.create(WatherServices.class);

        Call<city> cityCall =  service.getCity("München","b6907d289e10d714a6e88b30761fae22");

        cityCall.enqueue(new Callback<city>() {
            @Override
            public void onResponse(Call<city> call, Response<city> response) {

              city city =  response.body();

            }

            @Override
            public void onFailure(Call<city> call, Throwable t) {
                    Toast.makeText(MainActivity.this,"Error", Toast.LENGTH_LONG).show();
            }
        });



    }


}

