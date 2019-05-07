package com.example.maumene.grille;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=1 ; i<10 ; i++ ) {


            View textview = findViewById(getResources().getIdentifier("id"+i,"id",this.getPackageName()));
            Controller tl = new Controller(textview);
            textview.setOnTouchListener(tl);
        }
    }
}
