package com.example.tsdmh_7s5_prac5_rodriguezmorales;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import Informacion.DatosDTO;

public class PrincipalActivity extends AppCompatActivity {

    EditText txtnombre, txtedad, txtcorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtnombre = findViewById(R.id.txtnombre);
        txtedad = findViewById(R.id.txtedad);
        txtcorreo = findViewById(R.id.txtcorreo);
    }

    public void clickbtn(View v){
        DatosDTO datos = new DatosDTO(txtnombre.getText().toString(),
                Integer.parseInt(txtedad.getText().toString()),
                txtcorreo.getText().toString());
        Intent intent = new Intent(this,RecibeActivity.class);
        intent.putExtra("Datos",datos);
        startActivity(intent);
    }
}