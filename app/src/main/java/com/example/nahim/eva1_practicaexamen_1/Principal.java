package com.example.nahim.eva1_practicaexamen_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    RadioGroup rdgCafe;
    RadioButton rdbtnAmericano, rdbtnCapuccino, rdbtnExpreso;
    CheckBox chkboxAzucar, chkboxCrema;
    Button btnTotal;
    EditText edtCantidad;
    int precio, cantidad, precioxcantidad, preciototal, casoCafe=0;
    TextView txtDescripcion;
    String descripcion;
    Toast toast;

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
        txtDescripcion = (TextView) findViewById(R.id.txtVwDescripcionCompra);


    }

    public void ClickTotal(View v) {
        if (rdbtnAmericano.isChecked()){
            casoCafe =1;
            descripcion = (edtCantidad.getText().toString())+" cafe(s) Americano";
        }
        else if (rdbtnCapuccino.isChecked()){
            casoCafe =2;
           descripcion = edtCantidad.getText().toString()+" cafe(s) Capuccino";
        }
        else if (rdbtnExpreso.isChecked()) {
            casoCafe = 3;
            descripcion = edtCantidad.getText().toString()+" cafe(s) Expreso";
        }
        if ((chkboxAzucar.isChecked())&&(chkboxCrema.isChecked()==false))
            descripcion= descripcion+ ", con Azucar extra";
        else if ((chkboxAzucar.isChecked()==false)&&(chkboxCrema.isChecked()==true))
            descripcion= descripcion+", con Crema extra";

        switch (casoCafe){
            case 1:
                precio =20;
                cantidad = Integer.parseInt(edtCantidad.getText().toString());
                precioxcantidad= precio*cantidad;
                    if ((chkboxAzucar.isChecked())&&(chkboxCrema.isChecked())) {
                        preciototal = precioxcantidad + 2;
                        descripcion = descripcion + ", con Azucar y Crema extra";
                    }
                    else if ((chkboxCrema.isChecked()==false)&&(chkboxAzucar.isChecked()==false)){
                        preciototal=precioxcantidad;
                        descripcion = descripcion+ ", sin ningun extra";
                    }
                    else
                        preciototal = precioxcantidad+1;
                txtDescripcion.setText(descripcion);
                 toast = Toast.makeText(this,"Precio total es igual:"+preciototal,Toast.LENGTH_SHORT);
                toast.show();
                break;
            case 2:
                precio =48;
                cantidad = Integer.parseInt(edtCantidad.getText().toString());
                precioxcantidad= precio*cantidad;
                if ((chkboxAzucar.isChecked())&&(chkboxCrema.isChecked())) {
                    preciototal = precioxcantidad + 2;
                    descripcion = descripcion + ", con Azucar y Crema extra";
                }
                else if ((chkboxCrema.isChecked()==false)&&(chkboxAzucar.isChecked()==false)){
                    preciototal=precioxcantidad;
                    descripcion = descripcion+ ", sin ningun extra";
                }
                else
                    preciototal = precioxcantidad+1;
                txtDescripcion.setText(descripcion);
                toast = Toast.makeText(this,"Precio total es igual:"+preciototal,Toast.LENGTH_SHORT);
                toast.show();
                break;
            case 3:
                precio =30;
                cantidad = Integer.parseInt(edtCantidad.getText().toString());
                precioxcantidad= precio*cantidad;
                if ((chkboxAzucar.isChecked())&&(chkboxCrema.isChecked())){
                    preciototal=precioxcantidad+2;
                    descripcion = descripcion + ", con Azucar y Crema extra";
                }
                else if ((chkboxCrema.isChecked()==false)&&(chkboxAzucar.isChecked()==false)){
                    preciototal=precioxcantidad;
                    descripcion = descripcion+ ", sin ningun extra";
                }
                else
                    preciototal = precioxcantidad+1;
                txtDescripcion.setText(descripcion);
                toast = Toast.makeText(this,"Precio total es igual:"+preciototal,Toast.LENGTH_SHORT);
                toast.show();
                break;

        }

    }
}