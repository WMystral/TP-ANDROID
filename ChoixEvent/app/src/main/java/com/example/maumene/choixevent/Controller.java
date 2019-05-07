package com.example.maumene.choixevent;

import android.widget.RadioGroup;

public class Controller implements RadioGroup.OnCheckedChangeListener {

    private Forme f;

    public Controller(Forme form) {

        this.f=form;

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.f.setIdChecked(i);
    }
}
