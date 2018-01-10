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

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String json = "{" +
                         "id: 0," +
                             "city: {" +
                             "id: 'london'," +
                             "name: 'london'" +
                //ignorar parametrosl
                             "}"+
                "}";

        city city = null;
            try{
                JSONObject mJson = new JSONObject(json);
                int id = mJson.getInt("id");
                String name = mJson.getString("name");

                city = new city(id, name);


            } catch (JSONException e) {
                e.printStackTrace();
            }


            //filtrando los objetos de objetos
        Gson gson = new GsonBuilder().create();
        Town town = gson.fromJson(json,Town.class);


        /*
        //filtar elementos del json
          Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
            city city1 = gson.fromJson(json,city.class);
            **/

      /*
        //Enviamos nuevamente un json
        Gson gson = new Gson();

        Toast.makeText(this,city.getId() + " -- " + city.getName(), Toast.LENGTH_LONG).show();

        */
    }


}

