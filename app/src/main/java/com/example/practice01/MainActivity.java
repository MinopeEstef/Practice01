package com.example.practice01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView message;
    Button buttonValidate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message  = findViewById(R.id.message);
        buttonValidate = findViewById(R.id.button);

        buttonValidate.setOnClickListener(new View.OnClickListener() {
            String userName = "Miñope Anchaya, Estefani";

            @Override
            public void onClick(View view) {
                message.setText("Bienvenida ".concat(userName));
            }
        });
    }
}