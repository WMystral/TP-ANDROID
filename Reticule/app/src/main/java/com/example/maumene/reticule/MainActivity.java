package com.example.maumene.reticule;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private ViewReticule vR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewReticule vR = findViewById(R.id.reticule);
        Controller c = new Controller(vR);
        this.vR.setOnTouchListener(c);

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        vR.setPosition(savedInstanceState.getInt("posx"), savedInstanceState.getInt("posy"));
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("posx", vR.getPosX());
        savedInstanceState.putInt("posy", vR.getPosY());

    }
}