package com.quinteropro.formularioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_dato);

        // Importamos datos
        Bundle bundle = getIntent().getExtras();
        String importarNombre      = bundle.getString("nombreCompleto");
        String importarFecha       = bundle.getString("fechaNac");
        String importarTelefono    = bundle.getString("telf");
        String importarEmail       = bundle.getString("email");
        String importarDescripcion = bundle.getString("descrip");

        String textoNombre      = importarNombre;
        String textoFecha       = importarFecha;
        String textoTelefono    = importarTelefono;
        String textoEmail       = importarEmail;
        String textoDescripcion = importarDescripcion;

        TextView out1 = (TextView) findViewById(R.id.tvRecibe_Nombre);
        TextView out2 = (TextView) findViewById(R.id.tvRecibe_Fecha);
        TextView out3 = (TextView) findViewById(R.id.tvRecibe_Telefono);
        TextView out4 = (TextView) findViewById(R.id.tvRecibe_Email);
        TextView out5 = (TextView) findViewById(R.id.tvRecibe_Descripcion);

        out1.setText(textoNombre);
        out2.setText(textoFecha);
        out3.setText(textoTelefono);
        out4.setText(textoEmail);
        out5.setText(textoDescripcion);

        Button btn2 = (Button) findViewById(R.id.btn_editar);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent2, 0);
            }
        });
    }
}