package com.amp.directory;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 **   Directorio Médico Created by Arturo on 07/09/2015, 11:29.
 **/


public class Demo1 extends Utilidades {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);
        setToolbar();
        setHome(true);
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(getApplicationContext(), R.string.respBack, Toast.LENGTH_SHORT).show();
        NavUtils.navigateUpFromSameTask(this);
        overridePendingTransition(R.anim.anim_derecha_in, R.anim.anim_derecha_out);
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
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
        return true;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        return false;
    }
}