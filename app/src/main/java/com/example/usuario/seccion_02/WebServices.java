package com.example.usuario.seccion_02;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Usuario on 10/01/2018.
 */

public interface WebServices {



        @GET("forecast")
        Call<Usuario> Obtener_usuarios();

        //Call<Usuario> Obtener_usuarios(@Query("m") String metodo);

}
