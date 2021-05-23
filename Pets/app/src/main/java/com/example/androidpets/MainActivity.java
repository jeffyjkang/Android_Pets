package com.example.androidpets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewPets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewPets = findViewById(R.id.textView_pets);

        textViewPets.setText("Orca \nTiger \nFalcon \nBear \nEagle \nDolphin");
    }
}