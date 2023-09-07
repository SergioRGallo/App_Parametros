package edu.utec.app_parametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText) findViewById(R.id.txt_nombre);

    }

    // metodo para el boton enviar
    public void Enviar(View view){
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("dato", etNombre.getText().toString());
        startActivity(i);
    }


}