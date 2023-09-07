package edu.utec.app_parametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNombre = (TextView) findViewById(R.id.tv_nombre);

        String dato = getIntent().getStringExtra("dato");
        tvNombre.setText("Hola " + dato);
    }

    // Creo el metodo para el boton Regresar
    public void Regresar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }

}