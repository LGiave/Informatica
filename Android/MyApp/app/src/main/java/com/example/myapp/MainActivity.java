package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity";
    private Button btnsal;
    private TextView txtS;
    private Button btnAltoBasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindComponent();
        setupEventListener();
    }

    private void bindComponent(){
        txtS = findViewById(R.id.txtsaluta);
        btnsal = findViewById(R.id.btnsaluta);
        btnAltoBasso = findViewById(R.id.btnaltobasso);
    }

    private  void setupEventListener(){

        btnsal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtS.setText("osanna weeeeee");
            }
        });

        btnAltoBasso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // avvio nuova activity alto&basso
                Intent intent = new Intent(MainActivity.this , AltoBassoActivity.class);
                startActivity(intent);
            }
        }
        );
    }
}
