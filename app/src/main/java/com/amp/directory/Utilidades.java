package com.amp.directory;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 **   Directorio Médico Created by Arturo on 07/09/2015, 11:29.
 **/

public class Utilidades extends GetSet {

    private MenuItem mSearchItem;
    public SearchView mSearchView;
    public boolean salida = false;
    public final int DURACION_SALIDA = 3000;
    public final int DURACION_SPLASH = 3000; // 3 segundos

    //Configura el Toolbar como ActionBar
    public void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_toolbar);
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeButtonEnabled(true);
        }
    }

    public void setSearchItem(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portada, menu);
        mSearchItem = menu.findItem(R.id.action_search);
        mSearchView = (SearchView) MenuItemCompat.getActionView(mSearchItem);
        mSearchView.setOnQueryTextListener(this);
    }

    public void btnBuscar(View button){
        mSearchView.setIconified(false);
    }
    public void btnAmigo(View button){
        Toast.makeText(getApplicationContext(), R.string.respAmigo, Toast.LENGTH_SHORT).show();
    }
    public void btnEspecialidades(View button){
        Toast.makeText(getApplicationContext(), R.string.respEspecialidades, Toast.LENGTH_SHORT).show();
    }
    public void btnCorazon(View button){
        Toast.makeText(getApplicationContext(), R.string.respCorazon, Toast.LENGTH_SHORT).show();
    }
    public void btnDescubrelo(View button){
        Toast.makeText(getApplicationContext(), R.string.respDescubrelo, Toast.LENGTH_SHORT).show();
    }
    public void btnTriangulo(View button){
        Toast.makeText(getApplicationContext(), R.string.respTriangulo, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, Demo1.class));
        overridePendingTransition(R.anim.anim_izquierda_in, R.anim.anim_izquierda_out);
    }
    public void btnVerde(View button){
        Toast.makeText(getApplicationContext(), R.string.respVerde, Toast.LENGTH_SHORT).show();
    }
    public void btnAzul(View button){
        Toast.makeText(getApplicationContext(), R.string.respAzul, Toast.LENGTH_SHORT).show();
    }
    public void btnVioleta(View button){
        Toast.makeText(getApplicationContext(), R.string.respVioleta, Toast.LENGTH_SHORT).show();
    }
    public void btnRojo(View button){
        Toast.makeText(getApplicationContext(), R.string.respRojo, Toast.LENGTH_SHORT).show();
    }
    public void btnAMP(View button){
        Toast.makeText(getApplicationContext(), R.string.respAMP, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, Demo2.class));
        overridePendingTransition(R.anim.anim_desvanecer_in, R.anim.anim_desvanecer_out);
    }
    public void btnFarmacia(View button){
        Toast.makeText(getApplicationContext(), R.string.respFarmacia, Toast.LENGTH_SHORT).show();
    }
}