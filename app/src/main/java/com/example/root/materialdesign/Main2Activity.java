package com.example.root.materialdesign;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Snackbar.make(this.getWindow().getDecorView(), "Has cambiado", Snackbar.LENGTH_LONG).show();
    }
}
