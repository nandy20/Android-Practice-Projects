package com.example.nandhini.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void calc(View view){

        EditText cur=(EditText) findViewById(R.id.editText);
        Double neww = Double.parseDouble(cur.getText().toString());
        Double convert=neww*70;
        Toast.makeText(this,convert.toString(), Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
