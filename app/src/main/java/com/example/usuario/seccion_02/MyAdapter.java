package com.example.usuario.seccion_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<String> names;

    public MyAdapter(Context context, int layout, List<String> names) {
        this.context = context;
        this.layout = layout;
        this.names = names;
    }

    @Override
    public int getCount(){
        return this.names.size();
    }

    @Override
    public Object getItem(int position) {
        return this.names.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        //Copiamos la vista
        View v = convertView;

        //Se infla el layout y de copia el formato de lista a la nueva
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(this.layout,null);

        //Traemos el nombre actual dependiendo de la posiciòn
        String currentName = names.get(position);
        //currentName = (String) getItem(position);


        //Referenciamos el elemnto a modificar y es llenado
        TextView textView = (TextView) v.findViewById(R.id.textView);
        textView.setText(currentName);

        //se devuelve la lista llena y modificada
        return v;

    }
}
