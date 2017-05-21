package com.example.erick.lab1_ejercicios3;

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

        caja1 = (EditText) findViewById(R.id.et1);
        resultado = (TextView) findViewById(R.id.tv1);

    }
    public int factorial(int num) {
        int aux = 1;
        for (int i = 2; i <= num; i++)
            aux = aux * i;
        return aux;
    }

    public int factorial2(int num) {
        if (num == 0)
            return 1;
        else
            return num * factorial2(num - 1);
    }

    public void Factorial(View view) {
        String valor8 = caja1.getText().toString();
        int num = Integer.parseInt(valor8);

        resultado.setText("El Factorial es: " + factorial(num));
    }

}

