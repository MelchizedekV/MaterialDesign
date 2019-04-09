package com.example.materialdesign.Toolbar;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.example.materialdesign.R;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    int menu;
    Snackbar snackbar;
    RelativeLayout rootlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        rootlayout=findViewById(R.id.rootlayout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
         menu=item.getItemId();
        if (menu == R.id.logoutbtn)
        {
            snackbar.make(rootlayout,"Logout Button is clicked",Snackbar.LENGTH_LONG).show();


        }

        if (menu == R.id.add)
        {

            startActivity(new Intent(this, NewActivity.class));
        }

        return true;
    }

}
