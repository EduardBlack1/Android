package com.example.usuario.seccion_02;

import com.google.gson.annotations.Expose;

/**
 * Created by Usuario on 10/01/2018.
 */

public class city {

    @Expose //ignorar el siguiente cambo que es id
    private int id;
    private String name;


    public city(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
