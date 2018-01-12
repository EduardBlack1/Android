package com.example.usuario.seccion_02;

import com.google.gson.annotations.Expose;

/**
 * Created by Usuario on 10/01/2018.
 */

public class Usuario {

    @Expose //ignorar el siguiente cambo que es id
    private String usuario;
    private String password;

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
