package com.amp.directory;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

/**
 **   Directorio Médico Created by Arturo on 07/08/2015, 11:29.
 **/

public class SplashActivity extends Utilidades {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Tenemos una plantilla llamada splash_01.xml de donde mostraremos la información que queramos (logotipo, etc.)
        setContentView(R.layout.splash_01);

        new Handler().postDelayed(new Runnable(){
            public void run(){
                //Cuando pasen los 3 segundos, pasamos a la actividad principal de la aplicación
                Intent intent = new Intent(SplashActivity.this, com.amp.directory.Portada.class);
                startActivity(intent);
                //Ponemos una transición para pasar al activity principal
                overridePendingTransition(R.anim.anim_desvanecer_in, R.anim.anim_desvanecer_out);
                finish();
            }
        }, DURACION_SPLASH);
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(getApplicationContext(), R.string.respSalida, Toast.LENGTH_SHORT).show();

        if (salida) {
            finish();
        }
        else
        {
            salida = true;
        }
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run(){
                //Cuando pasen 3 segundos, reiniciamos el contador de salida
                salida = false;
            }
        }, DURACION_SALIDA);
    }
}
