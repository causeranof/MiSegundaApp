package com.example.fcauserano.misegundaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private LinearLayout linearLayout;
    private TextView textViewHello;
    private TextView textViewName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);g
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit_text_nombre);
        linearLayout = findViewById(R.id.linear_layout);
        textViewHello = findViewById(R.id.text_view_hello);
        textViewName = findViewById(R.id.text_view_name);
    }

    public void clickBoton(View view) {
        String texto = "Hola " + editText.getText().toString() + " campeon!!";
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
        linearLayout.setBackgroundColor(getResources().getColor(R.color.rojoOscuro));
        textViewHello.setTextColor(getResources().getColor(R.color.rojoOscuro));
        textViewName.setText("Nombre y Apellido");
    }


}
