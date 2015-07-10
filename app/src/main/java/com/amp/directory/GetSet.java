package com.amp.directory;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.widget.Toast;

/**
 **   Directorio Médico Created by Arturo on 07/10/2015, 11:31.
 **/

public class GetSet extends AppCompatActivity implements SearchView.OnQueryTextListener {


    private Dialog dialogo;

    @Override
    public boolean onQueryTextSubmit(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
        return true;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        return false;
    }

    // ** //

    public void setHome(boolean estado) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(estado);
    }

    // ** //

    public void setSplashDialog(Dialog dialogo) {
        this.dialogo = dialogo;
    }

    public Dialog getSplashDialog() {
        return dialogo;
    }
}
