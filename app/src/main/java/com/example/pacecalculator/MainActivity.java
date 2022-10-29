package com.example.pacecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button calcular;
    private TextView distancia, horas, minutos, segundos, resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void iniciarComponentes() {
        calcular = findViewById(R.id.bt_calcular);
        distancia = findViewById(R.id.txt_distancia_input);
        horas = findViewById(R.id.txt_horas);
        minutos = findViewById(R.id.txt_minutos);
        segundos = findViewById(R.id.txt_segundos);
        resultado = findViewById(R.id.text_result_tempo);
    }
}