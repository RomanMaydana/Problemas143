package com.maydana.roman.problemas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void conversion(View view) {
        intent = new Intent(MainActivity.this,ConversionActivity.class);
        startActivity(intent);
    }

    public void literal(View view) {
        intent = new Intent(MainActivity.this,LiteralActivity.class);
        startActivity(intent);

    }

    public void juego(View view) {
        intent = new Intent(MainActivity.this,JuegoActivity.class);
        startActivity(intent);

    }

    public void pagar(View view) {
        intent = new Intent(MainActivity.this,PagarActivity.class);
        startActivity(intent);
    }

    public void uva11450(View view) {
        intent = new Intent(MainActivity.this,Ej11450Activity.class);
        startActivity(intent);
    }
}
