package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void frenchToast(View view)
    {
        Toast.makeText(this, "Nom nom! Max & Ginger enjoyed their meal!", Toast.LENGTH_LONG).show();
    }

    public void secrets(View view)
    {
        Log.i("info", "Happy Birthday Grandma! <3");
    }

}
