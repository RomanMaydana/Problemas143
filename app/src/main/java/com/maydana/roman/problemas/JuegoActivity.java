package com.maydana.roman.problemas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.bolivia.qulqi.Qulqi;

import java.util.Random;

public class JuegoActivity extends AppCompatActivity {
    private EditText intentosEditText;
    private EditText numeroEditText;
    private TextView resultadoTextView;
    private Random random;
    private int numRandom;
    private int intento;
    private int numero=1;
    private boolean sw = false,aux = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        intentosEditText = (EditText)findViewById(R.id.intentosEditText);
        numeroEditText = (EditText)findViewById(R.id.numeroEditText);
        resultadoTextView = (TextView)findViewById(R.id.resultadoTextView);
        random = new Random();
        numRandom = random.nextInt(11);


    }

    public void intentos(View view) {
        if(intentosEditText.getText().toString().length() == 0 || sw){
            return;
        }
        intento = Integer.parseInt(intentosEditText.getText().toString());
        Toast.makeText(this, "Numero Guardado", Toast.LENGTH_SHORT).show();
        sw = true;

    }

    public void reinicia(View view) {
        intentosEditText.getText().clear();
        numeroEditText.getText().clear();
        numero = 1;
        sw=aux = false;
        numRandom = random.nextInt(11);
        resultadoTextView.setText("");
    }

    public void jugar(View view) {
        int nro = Integer.parseInt(numeroEditText.getText().toString());
        if(nro < 0 || nro > 10 || numeroEditText.getText().toString().length() == 0)
        {
            Toast.makeText(this, "INGRESE UN NUMERO ENTRE 0 - 10", Toast.LENGTH_SHORT).show();
            return;
        }

        if(numero <= intento ) {
            Toast.makeText(this, "Intento "+numero, Toast.LENGTH_SHORT).show();

            if (nro == numRandom) {
                Qulqi qulqi = new Qulqi();
                String res = qulqi.showMeTheMoney(numero + "");
                resultadoTextView.setText("Ganó en " + res.substring(0, res.length() - 11) + " intento");
                numero = intento;
                aux = true;
                return;
            }
            numero++;
        }
        if(numero  == intento+1 && !aux)
            resultadoTextView.setText("Perdió");


    }
}
