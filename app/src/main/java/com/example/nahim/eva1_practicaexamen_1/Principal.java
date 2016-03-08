package com.example.nahim.eva1_practicaexamen_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    RadioGroup rdgCafe;
    RadioButton rdbtnAmericano, rdbtnCapuccino, rdbtnExpreso;
    CheckBox chkboxAzucar, chkboxCrema;
    Button btnTotal;
    EditText edtCantidad;
    int precio, cantidad, precioxcantidad, preciototal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rdgCafe = (RadioGroup) findViewById(R.id.rdgCafe);
        rdbtnAmericano = (RadioButton) findViewById(R.id.rdbtnAmericano);
        rdbtnCapuccino = (RadioButton) findViewById(R.id.rdbtnCapuchino);
        rdbtnExpreso = (RadioButton) findViewById(R.id.rdbtnExpreso);
        chkboxAzucar = (CheckBox) findViewById(R.id.chkbxAzucar);
        chkboxCrema = (CheckBox) findViewById(R.id.chkbxCrema);
        btnTotal = (Button) findViewById(R.id.btnTotal);
        edtCantidad = (EditText) findViewById(R.id.edtCantidad);


    }

    public void ClickTotal(View v) {

         if (rdbtnExpreso.isClickable() == true) {

          precio = 40;
          String cantidad1 = edtCantidad.getText().toString();
          cantidad = Integer.parseInt(cantidad1);
           precioxcantidad = precio * cantidad;
          if ((chkboxCrema.isClickable() == true) && (chkboxAzucar.isChecked() == true)) {
              preciototal = precioxcantidad + 2;
          } else if ((chkboxCrema.isClickable() == false) && (chkboxAzucar.isChecked() == false)) {
              preciototal = precioxcantidad;
          } else preciototal = precioxcantidad + 1;

        } else if (rdbtnCapuccino.isClickable() == true) {
          precio = 48;
          cantidad = Integer.parseInt(edtCantidad.getText().toString());
          precioxcantidad = precio * cantidad;
          if ((chkboxCrema.isClickable() == true) && (chkboxAzucar.isChecked() == true)) {
              preciototal = precioxcantidad + 2;
          } else if ((chkboxCrema.isClickable() == false) && (chkboxAzucar.isChecked() == false)) {
            preciototal = precioxcantidad;
          } else preciototal = precioxcantidad + 1;

        } else if (rdbtnAmericano.isClickable() == true) {
                  precio = 20;
          cantidad = Integer.parseInt(edtCantidad.getText().toString());
          precioxcantidad = precio * cantidad;
          if ((chkboxCrema.isClickable() == true) && (chkboxAzucar.isChecked() == true)) {
              preciototal = precioxcantidad + 2;
          } else if ((chkboxCrema.isClickable() == false) && (chkboxAzucar.isChecked() == false)) {
              preciototal = precioxcantidad;
          } else preciototal = precioxcantidad + 1;
        }
        Toast toast = Toast.makeText(this,"Precio total es igual:"+preciototal,Toast.LENGTH_SHORT);
        toast.show();
    }
}