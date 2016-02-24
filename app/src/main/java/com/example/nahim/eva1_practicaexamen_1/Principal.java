package com.example.nahim.eva1_practicaexamen_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

public class Principal extends AppCompatActivity {
    RadioGroup rdgCafe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rdgCafe = (RadioGroup) findViewById(R.id.rdgCafe);
    }
}
