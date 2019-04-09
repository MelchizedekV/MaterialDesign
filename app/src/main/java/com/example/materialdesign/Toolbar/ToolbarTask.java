package com.example.materialdesign.Toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.materialdesign.R;

public class ToolbarTask extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_task);
        toolbar=findViewById(R.id.tasktoolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Tez Mode transaction");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.tasktoolbarmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        if(id==R.id.Archived)
        {
            Toast.makeText(this,"Archived is clicked",Toast.LENGTH_LONG).show();
        }
        if(id==R.id.mark)
        {
            Toast.makeText(this,"mark is clicked",Toast.LENGTH_LONG).show();
        }
        if(id==R.id.block)
        {
            Toast.makeText(this,"block is clicked",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
