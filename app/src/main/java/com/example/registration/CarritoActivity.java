package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CarritoActivity extends AppCompatActivity {
    int contador,contador2,contador3;
    private Button btnSumar,btnSumar2,btnSumar3, btnRestar,btnRestar2,btnRestar3;
    private TextView tvContador,tvContador2,tvContador3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contador = 1;
        contador2 = 1;
        contador3 = 1;
        setContentView(R.layout.activity_carrito);
        btnRestar = (Button) findViewById(R.id.btnMenos);
        btnRestar2 = (Button) findViewById(R.id.btnMenos2);
        btnRestar3 = (Button) findViewById(R.id.btnMenos3);
        btnRestar.setEnabled(false);
        btnRestar2.setEnabled(false);
        btnRestar3.setEnabled(false);
        btnRestar.setOnClickListener(v -> {
            contador --;
            tvContador.setText(Integer.toString(contador));
            if (contador== 0) {
                btnRestar.setEnabled(false);
            }
        });
        btnRestar2.setOnClickListener(v -> {
            contador2 --;
            tvContador2.setText(Integer.toString(contador2));
            if (contador2== 0) {
                btnRestar2.setEnabled(false);
            }
        });
        btnRestar3.setOnClickListener(v -> {
            contador3 --;
            tvContador3.setText(Integer.toString(contador3));
            if (contador3== 0) {
                btnRestar3.setEnabled(false);
            }
        });

        btnSumar = (Button) findViewById(R.id.btnMas);
        btnSumar2 = (Button) findViewById(R.id.btnMas2);
        btnSumar3 = (Button) findViewById(R.id.btnMas3);
        btnSumar.setOnClickListener(v -> {
            contador ++;
            tvContador.setText(Integer.toString(contador));
            if (contador > 0){
                btnRestar.setEnabled(true);
            }
        });
        btnSumar2.setOnClickListener(v -> {
            contador2 ++;
            tvContador2.setText(Integer.toString(contador2));
            if (contador2 > 0){
                btnRestar2.setEnabled(true);
            }
        });
        btnSumar3.setOnClickListener(v -> {
            contador3 ++;
            tvContador3.setText(Integer.toString(contador3));
            if (contador3 > 0){
                btnRestar3.setEnabled(true);
            }
        });
        tvContador = (TextView) findViewById(R.id.tvContador);
        tvContador2 = (TextView) findViewById(R.id.tvContador2);
        tvContador3 = (TextView) findViewById(R.id.tvContador3);
        tvContador.setText(Integer.toString(contador));
        tvContador2.setText(Integer.toString(contador2));
        tvContador3.setText(Integer.toString(contador3));

    }

    public void seguirComprando(View view) {

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }

    public void pagar(View view) {

        Intent i = new Intent(getApplicationContext(), TarjetaActivity.class);
        startActivity(i);
    }
}