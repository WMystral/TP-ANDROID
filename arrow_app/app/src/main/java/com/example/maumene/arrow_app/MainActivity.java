package com.example.maumene.arrow_app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    private Image image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button left =(Button) this.findViewById(R.id.left);
        Button right = (Button) this.findViewById(R.id.right);

        this.image = findViewById(R.id.image);
        Controleur c = new Controleur(this.image);

        left.setOnClickListener(c);
        right.setOnClickListener(c);


    }
}
