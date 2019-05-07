package com.example.maumene.poids;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class Controller implements View.OnTouchListener {

    private FormePois view;
    private float x;
    private float y;
    private int id;
    private int pid;

    public Controller(FormePois v) {
        this.view = v;
        this.x = 0;
        this.y = 0;
        this.id = 0;
        this.pid=0;
    }

    @Override
    public boolean onTouch(View v, MotionEvent me) {

        int masked = me.getActionMasked();


        if (masked == MotionEvent.ACTION_DOWN) {


            this.x = me.getX();
            this.y = me.getY();
            this.view.addCircle(me.getPointerId(0), this.x, this.y);

        } else if (masked == MotionEvent.ACTION_POINTER_DOWN) {
            this.id = me.getActionIndex();

            this.x = me.getX(id);
            this.y = me.getY(id);
            this.view.addCircle(me.getPointerId(id), this.x, this.y);

        } else if(masked == MotionEvent.ACTION_MOVE) {
            for (int i = 0; i < me.getPointerCount(); i++) {

                float posx = me.getX(i);
                float posy = me.getY(i);
                this.view.moveCircle(me.getPointerId(i), posx, posy);

            }
        } else if (masked == MotionEvent.ACTION_UP) {
            Log.d("debug","actio up");
            this.id = me.getActionIndex();
            this.view.removeCircle(me.getPointerId(id));

        } else if (masked == MotionEvent.ACTION_POINTER_UP) {
            Log.d("debug","actio pointer up");
            this.id = me.getActionIndex();
            this.view.removeCircle(me.getPointerId(id));

        } else {
            Log.e("e","evt non traité");
        }

        this.view.invalidate();
        return true;
    }
}
