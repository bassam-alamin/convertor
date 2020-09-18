package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText mlm = findViewById(R.id.milimetre);
                String millimetres = mlm.getText().toString();
                double milli = Double.parseDouble(millimetres);
                Double inches = milli/25.4;

                EditText inch = findViewById(R.id.inches);
                inch.setText(String.valueOf(inches));


            }
        });

        Button btn2 = findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}