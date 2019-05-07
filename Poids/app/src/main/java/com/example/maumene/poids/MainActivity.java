package com.example.maumene.poids;

import android.app.Activity;
import android.os.Bundle;

import java.text.Normalizer;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FormePois fp = (FormePois) findViewById(R.id.poiss);
        Controller c = new Controller(fp);
        fp.setOnTouchListener(c);
    }
}
