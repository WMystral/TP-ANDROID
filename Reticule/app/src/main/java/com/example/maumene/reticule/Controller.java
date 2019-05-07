package com.example.maumene.reticule;

import android.view.MotionEvent;
import android.view.View;

public class Controller implements View.OnTouchListener {

    private ViewReticule viewreticule;
    public Controller(ViewReticule vr) {
        this.viewreticule = vr;
    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(motionEvent.getActionMasked() == MotionEvent.ACTION_DOWN) {
            this.viewreticule.setPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }else if(motionEvent.getActionMasked() == MotionEvent.ACTION_MOVE) {
            this.viewreticule.setPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            this.viewreticule.movePosition();
        }
        this.viewreticule.invalidate();
        return true;
    }
}


