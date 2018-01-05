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

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

            //Datos a mostrar
        names = new ArrayList<String>();
        names.add("Eduardo");
        names.add("Luis");
        names.add("Pedro");
        names.add("Mario");
        names.add("Jose");

            //Adaptador, la fonrma de mostrar los datos en la lista
            // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        //llenamos el listView con los datos adaptados
        //listView.setAdapter(adapter);


        //Mètodo para detectar elemento seleccionado de la vista
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view,int position,long id){

              Toast.makeText(MainActivity.this,"Clicked: "+ names.get(position), Toast.LENGTH_LONG).show();

          }

        });

        //Enlazamos con nuestro adaptador personalizado
        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_item, names);
        listView.setAdapter(myAdapter);
    }
}

