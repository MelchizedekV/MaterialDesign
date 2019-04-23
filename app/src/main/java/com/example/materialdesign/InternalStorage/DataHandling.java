package com.example.materialdesign.InternalStorage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.materialdesign.R;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataHandling extends Activity {

    EditText Name,password;
    String bname,bpassword;
    String FileName="Melchi.txt";
    FileOutputStream fileOutputStream;
    Button Load;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_handling);

        Name=findViewById(R.id.loadName);
        password=findViewById(R.id.loadPassword);
        Load=findViewById(R.id.Load);

        Load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                writeData();
            }
        });





    }

    private void writeData()
    {
        bname=Name.getText().toString();
        bpassword=password.getText().toString();

        try {
            fileOutputStream= openFileOutput(FileName,MODE_APPEND);
            fileOutputStream.write(bname.getBytes());
            fileOutputStream.write(bpassword.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
