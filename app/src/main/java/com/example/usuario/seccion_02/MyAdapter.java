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

       //View holder pattern
        ViewHolder holder;

        if (convertView == null){

            //Se infla el layout y de copia el formato de lista a la nueva
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(R.layout.list_item,null);

            holder = new ViewHolder();
            //Referenciamos el elemnto a modificar y es llenado
            holder.nameTextView = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();

        }


        //Traemos el nombre actual dependiendo de la posiciòn
        String currentName = names.get(position);
        //currentName = (String) getItem(position);


        //Referenciamos el elemnto a modificar y es llenado
        holder.nameTextView.setText(currentName);

        //se devuelve la lista llena y modificada
        return convertView;

    }

    static class ViewHolder{
        private TextView nameTextView;
    }
}
