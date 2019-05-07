package com.example.maumene.grille;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class Controller implements View.OnTouchListener {

    private View tv;
    private GestureDetector geste;

    public Controller(View v) {
        this.tv=v;
        GestDect gd = new GestDect(this.tv);
        this.geste = new GestureDetector(gd);
        this.geste.setIsLongpressEnabled(true);
    }

    public boolean onTouch(View vii, MotionEvent e) {

        this.geste.onTouchEvent(e);
        return true;
    }
}
