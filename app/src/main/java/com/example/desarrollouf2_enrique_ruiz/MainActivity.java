package com.example.desarrollouf2_enrique_ruiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void GotoActivity2(View bttnGotoActivity2) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
        Toast.makeText(this, "Redirigiendo a Activity2",Toast.LENGTH_SHORT).show();

    }


    public void GotoActivity3(View view) {
        Intent intent = new Intent(MainActivity.this,Activity3.class);
        startActivity(intent);
    }
}
