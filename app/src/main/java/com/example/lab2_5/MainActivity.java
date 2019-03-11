package com.example.lab2_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputLoota;
    TextView tulostus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLoota = findViewById(R.id.editText);
        tulostus = findViewById(R.id.tulostus);

        Button suomi = findViewById(R.id.Suomi);

        suomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tulostettava = inputLoota.getText().toString();
                tulostus.setText("Terve! " + tulostettava);
            }
        });

        Button ruotsi = findViewById(R.id.Ruotsi);

        ruotsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tulostettava = inputLoota.getText().toString();
                tulostus.setText("Hej! " + tulostettava);

            }
        });

        Button englanti = findViewById(R.id.Englanti);

        englanti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tulostettava = inputLoota.getText().toString();
                tulostus.setText("Hello! " + tulostettava);
            }
        });

        Button ullatus = findViewById(R.id.Ullatus);

        ullatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tulostettava = inputLoota.getText().toString();
                tulostus.setText("Hola! " + tulostettava);
            }
        });
    }
}
