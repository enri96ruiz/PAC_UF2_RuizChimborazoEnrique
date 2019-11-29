package com.example.desarrollouf2_enrique_ruiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    public void IniciarMusica(View view) {
        Intent intent = new Intent (this,servicio.class);
        startService(intent);
    }

    public void pararmusica(View view) {
        Intent intent = new Intent(Activity3.this,servicio.class);
        stopService(intent);
    }

    public void pararservicio(View view) {
        Intent intent = new Intent(Activity3.this,servicio1.class);
        startService(intent);
    }

    public void volver_Activity1(View view) {
        Intent intent = new Intent(Activity3.this,MainActivity.class);
        finish();
    }
}
