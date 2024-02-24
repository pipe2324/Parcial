package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    EditText campo1, campo2, textresultado;
    ImageView mango,cebollas;
    Button calcular;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        campo1=findViewById(R.id.campo1);
        campo2=findViewById(R.id.campo2);
        calcular=findViewById(R.id.calcular);
        textresultado=findViewById(R.id.textresultado);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculartotal();
            }
        });

}

    private void Calculartotal() {

        double num1=Double.parseDouble(campo1.getText().toString());
        double num2=Double.parseDouble(campo2.getText().toString());
        double precio_cebolla=2000;
        double precio_mango=5000;
        double resultado=(num1*precio_cebolla)+(num2*precio_mango);
        textresultado.setText(String.valueOf(resultado));
    }
    }
