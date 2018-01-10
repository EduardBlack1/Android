package com.example.usuario.seccion_02;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Created by Usuario on 10/01/2018.
 */

public class Town {


    private int id;
    private List<city> cities;

    public Town(int id, List<city> cities) {
        this.id = id;
        this.cities = cities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<city> getCities() {
        return cities;
    }

    public void setCities(List<city> cities) {
        this.cities = cities;
    }

    //para recorrer los objetos de objetos en el json
    public static city parseJSON(String respoonse){

        Gson gson = new GsonBuilder().create();
        city city = gson.fromJson(respoonse, city.class);
        return city;

    }


}
