package com.amp.directory;

import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 **   Directorio Médico Created by Arturo on 06/24/2015, 10:38.
 **/

public class Portada extends Utilidades {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portada);

        setToolbar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        setSearchItem(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch(item.getItemId()) {
            case R.id.action_search:
                mSearchView.setIconified(false);
                return true;
            case R.id.action_settings:
                return true;
        }
        return false;
    }

    //Prevenir salida involuntaria
    @Override
    public void onBackPressed(){

        Toast.makeText(getApplicationContext(), R.string.respSalida, Toast.LENGTH_SHORT).show();

        if (salida) {
            finish();
            overridePendingTransition(R.anim.anim_desvanecer_in, R.anim.anim_desvanecer_out);
        }
        else {
            salida = true;
        }
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                //Si pasan 3 segundos, reiniciamos el contador de salida
                salida = false;
            }
        }, DURACION_SALIDA);
    }
}