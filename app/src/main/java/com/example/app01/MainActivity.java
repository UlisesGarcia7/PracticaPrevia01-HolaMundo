package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Atributos
    private Button btnSaludar;
    private Button btnLimpiar;
    private Button btnCerrar;
    private EditText txtNombre;
    private TextView lblSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaludar = (Button) findViewById(R.id.btnSaludo);
        btnLimpiar = (Button) findViewById(R.id.btnBorrar);
        btnCerrar = (Button) findViewById(R.id.btnCerrar);
        txtNombre = (EditText) findViewById(R.id.txtSaludo2);
        lblSaludo = (TextView) findViewById(R.id.lblSaludo);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtNombre.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this,"Favor de Ingresar un Nombre",Toast.LENGTH_SHORT).show();
                }
                else{
                    String txtSaludar = txtNombre.getText().toString();
                    lblSaludo.setText("Hola " + txtSaludar + "¿Como Estas?");
                }
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lblSaludo.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this,"Caja Vacia",Toast.LENGTH_SHORT).show();
                }
                else{
                    lblSaludo.setText("");
                }

            }
        });

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}