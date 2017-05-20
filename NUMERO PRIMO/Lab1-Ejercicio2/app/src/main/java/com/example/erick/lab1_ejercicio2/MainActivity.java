package com.example.erick.lab1_ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caja1;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caja1=(EditText)findViewById(R.id.et1);
        resultado=(TextView)findViewById(R.id.tv2);
    }
    public  void btnprimo(View view){
        String valor=caja1.getText().toString();
        int num=Integer.parseInt(valor);

        int contador=2;
        boolean primo=true;
        String resul="";

        while((primo)&&(contador!=num)){
            if(num % contador == 0 || num == 1)
                primo = false;
                contador++;
        }
        if(primo == false){
            resul= "No es primo";}
        else {
            resul="Es primo";
        }
        resultado.setText(resul);
        }
    }



