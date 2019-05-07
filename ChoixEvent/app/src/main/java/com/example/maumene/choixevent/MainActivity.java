package com.example.maumene.choixevent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rg = (RadioGroup)findViewById(R.id.layoutbutton);
        Forme f = (Forme)findViewById(R.id.formo);
        Controller c = new Controller(f);
        rg.setOnCheckedChangeListener(c);
        f.setRadioGroup(rg);
    }
}
