package com.example.root.materialdesign;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText numero2, numero1;
    FloatingActionButton fab;
    Button cambiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);
        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        cambiar = (Button) findViewById(R.id.cambiar);

        cambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplicale(v);
                Snackbar.make(v, "Multiplicando...", Snackbar.LENGTH_LONG).show();
            }
        });

    }

    public void multiplicale(View view){
        int num1 = Integer.parseInt(numero1.getText().toString());
        int num2 = Integer.parseInt(numero2.getText().toString());
        int resultado = num1 * num2;
        result.setText(Integer.toString(resultado));
    }
}
