package com.example.usuario.seccion_02;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Usuario on 10/01/2018.
 */

public interface WatherServices {



        @GET("forecast")
        Call<city> getCity(@Query("q") String city, @Query("appid") String key);

}
