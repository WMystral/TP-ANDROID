package fr.demartin.jordan.tp4ex2n;

import android.view.GestureDetector;
import android.view.MotionEvent;

public class DonneTesDoigts implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {

    private LaVue dessin;

    public DonneTesDoigts(LaVue dessin){
        this.dessin = dessin;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        dessin.changeCouleur((int)motionEvent.getX(),(int)motionEvent.getY(),0);
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        dessin.changeCouleur((int)motionEvent.getX(),(int)motionEvent.getY(),1);
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        dessin.changeCouleur((int)motionEvent.getX(),(int)motionEvent.getY(),3);
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        dessin.changeCouleur((int)motionEvent.getX(),(int)motionEvent.getY(),2);
        return true;
    }
}
