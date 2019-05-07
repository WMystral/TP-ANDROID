package com.example.maumene.grille;

import android.graphics.Color;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class GestDect extends GestureDetector.SimpleOnGestureListener {

    private View textview;

    public GestDect(View tv) {
        this.textview=tv;
    }


    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY){
        this.textview.setBackgroundColor(Color.DKGRAY);

        return true;

    }

    @Override
    public void onLongPress(MotionEvent e) {
        this.textview.setBackgroundColor(Color.YELLOW);


    }


    @Override
    public boolean onDoubleTap(MotionEvent ev) {
        this.textview.setBackgroundColor(Color.MAGENTA);
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent ev) {
        this.textview.setBackgroundColor(Color.BLUE);
        return true;
    }




}
