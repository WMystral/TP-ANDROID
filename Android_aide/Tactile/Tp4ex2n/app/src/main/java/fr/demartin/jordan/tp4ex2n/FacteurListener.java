package fr.demartin.jordan.tp4ex2n;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class FacteurListener implements View.OnTouchListener {
    private GestureDetector mouvement;

    public FacteurListener(GestureDetector mouvement) {
        this.mouvement = mouvement;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return mouvement.onTouchEvent(motionEvent);
    }
}
