package com.example.usuario.seccion_02;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Usuario on 10/01/2018.
 */

public class Town {


    private int id;
    private  city city;

    public Town(int id, com.example.usuario.seccion_02.city city) {
        this.id = id;
        this.city = city;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public com.example.usuario.seccion_02.city getCity() {
        return city;
    }

    public void setCity(com.example.usuario.seccion_02.city city) {
        this.city = city;
    }


    //para recorrer los objetos de objetos en el json
    public static city parseJSON(String respoonse){

        Gson gson = new GsonBuilder().create();
        city city = gson.fromJson(respoonse, city.class);
        return city;

    }


}
