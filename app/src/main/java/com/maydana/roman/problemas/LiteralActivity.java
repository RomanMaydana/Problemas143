package com.maydana.roman.problemas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.bolivia.qulqi.Qulqi;
import org.bolivia.qulqi.Qulqi$COIN;
import org.bolivia.qulqi.Qulqi$FLOATING;


public class LiteralActivity extends AppCompatActivity {
    private EditText numeroEditView;
    private TextView literalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literal);

        numeroEditView = (EditText) findViewById(R.id.numeroEditText);
        literalTextView = (TextView) findViewById(R.id.literalTextView);

    }

    public void literal(View view) {
        Qulqi qulqi = new Qulqi();
        qulqi.setDecimalPartVisible(true);
        String num = qulqi.showMeTheMoney(numeroEditView.getText().toString());
        literalTextView.setText(num.substring(0,num.length()-11));
    }

    public void limpiar(View view) {
        numeroEditView.getText().clear();
        literalTextView.setText("");
    }
}
