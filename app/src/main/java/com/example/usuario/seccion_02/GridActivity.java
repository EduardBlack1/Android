package com.example.usuario.seccion_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    private GridView gridView;
    private List<String> names;
    private  MyAdapter myAdapter;

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);


        gridView = (GridView) findViewById(R.id.gridView);

        //Datos a mostrar
        names = new ArrayList<String>();
        names.add("Eduardo");
        names.add("Luis");
        names.add("Pedro");
        names.add("Mario");
        names.add("Jose");

        //Adaptador, la fonrma de mostrar los datos en la lista
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        //llenamos el listView con los datos adaptados
        gridView.setAdapter(adapter);


        //Mètodo para detectar elemento seleccionado de la vista
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id){

                Toast.makeText(GridActivity.this,"Clicked: "+ names.get(position), Toast.LENGTH_LONG).show();

            }

        });

        //Enlazamos con nuestro adaptador personalizado
       myAdapter = new MyAdapter(this, R.layout.grid_item, names);
        gridView.setAdapter(myAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu,menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.add_item:

                //añade el elemento a la lista
                this.names.add("Added n " + (++counter));
                //refresca el cambio de la lista en el adaptador
                this.myAdapter.notifyDataSetChanged();
                return true;

             default:

                 return super.onOptionsItemSelected(item);
        }



    }
}
