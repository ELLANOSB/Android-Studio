package com.example.erick.lab1_ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText caja1,caja2;
    private TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caja1=(EditText)findViewById(R.id.et1);
        caja2=(EditText)findViewById(R.id.et2);
        resultado=(TextView)findViewById(R.id.tv3);
    }

    public void  btnsumar(View view){
        String msj="";
        int n1=Integer.parseInt(caja1.getText().toString());
        int n2= Integer.parseInt(caja2.getText().toString());
        int suma=n1+n2;
        String s=String.valueOf(suma);
        resultado.setText(s);
        }
    }





