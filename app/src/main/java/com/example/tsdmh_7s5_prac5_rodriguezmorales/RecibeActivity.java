package com.example.tsdmh_7s5_prac5_rodriguezmorales;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import Informacion.DatosDTO;

public class RecibeActivity extends AppCompatActivity {
    TextView lblresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recibe);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lblresultado = findViewById(R.id.lblresultado);

        Intent intent = getIntent();
        DatosDTO datos = intent.getParcelableExtra("Datos");

        if(datos != null){
            lblresultado.setText(datos.getNombre() + " " +String.valueOf(datos.getEdad()) + " " +
                    datos.getCorreo());
        }
    }
}