package com.example.tofim.comunicationbetweenactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    private EditText edtName;
    private Button btnVerificar;
    private TextView txvReciever;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName=(EditText) findViewById(R.id.edtName);
        btnVerificar=(Button) findViewById(R.id.btnVerificar);
        txvReciever=(TextView) findViewById(R.id.txvReciever);
    }
}
