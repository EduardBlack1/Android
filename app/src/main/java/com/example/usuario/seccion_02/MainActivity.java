package com.example.usuario.seccion_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.126:8080/evots/webServices/Obtener_usuarios.php/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WebServices service = retrofit.create(WebServices.class);

        Call<Usuario> usuarioCall =  service.Obtener_usuarios();

        usuarioCall.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {

              Usuario Usuario =  response.body();

            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                    Toast.makeText(MainActivity.this,"Error", Toast.LENGTH_LONG).show();
            }
        });



    }


}

