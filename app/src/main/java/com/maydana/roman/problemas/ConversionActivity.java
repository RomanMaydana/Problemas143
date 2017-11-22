package com.maydana.roman.problemas;

import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ConversionActivity extends AppCompatActivity {
    private EditText cmEditText;
    private EditText mEditText;
    private EditText kmEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        cmEditText = (EditText)findViewById(R.id.cmEditText);
        mEditText = (EditText)findViewById(R.id.mEditText);
        kmEditText = (EditText)findViewById(R.id.kmEditText);

    }

    public void convierte(View view) {
        double num;
        if(cmEditText.getText().toString().length() > 0 && mEditText.getText().toString().length() > 0 && kmEditText.getText().toString().length() == 0  ||
                cmEditText.getText().toString().length() > 0&& mEditText.getText().toString().length() == 0 && kmEditText.getText().toString().length() > 0  ||
                cmEditText.getText().toString().length() == 0 && mEditText.getText().toString().length() > 0 && kmEditText.getText().toString().length() > 0) {
            Toast.makeText(this, "Error, solo se puede convertir 1 dato", Toast.LENGTH_SHORT).show();
            return;
        }
        if(cmEditText.getText().toString().length() > 0){
            num = Double.parseDouble(cmEditText.getText().toString());
            mEditText.setText((num/100)+"");
            kmEditText.setText((num/100000)+"");
        }else
        if(mEditText.getText().toString().length() > 0){
            num = Double.parseDouble(mEditText.getText().toString());
            cmEditText.setText((num*100)+"");
            kmEditText.setText((num/1000)+"");
        }else
        if(kmEditText.getText().toString().length() > 0){
            num = Double.parseDouble(kmEditText.getText().toString());
            cmEditText.setText((num*100000)+"");
            mEditText.setText((num*1000)+"");
        }
    }

    public void limpiar(View view) {
        cmEditText.getText().clear();
        mEditText.getText().clear();
        kmEditText.getText().clear();
    }
}
