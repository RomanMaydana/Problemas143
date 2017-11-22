package com.maydana.roman.problemas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.StringTokenizer;

public class Ej11450Activity extends AppCompatActivity {
    private EditText dineroEditText, nroPrendasEditText, cantPorPrendaEditText, precioPorPrendaEditText;
    private TextView solucionTextView;
    private int [][] price = new int[25][25];
    private int [][] memo = new int[210][25];
    private int dinero, nroPrendas,j,M;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej11450);

    }
}
