package com.example.maumene.arrow_app;

import android.view.View;

public class Controleur implements View.OnClickListener {

    private Image im;

    public Controleur(Image i) {

    this.im = i;
    }


    @Override
    public  void onClick(View v) {
        if(R.id.left== v.getId())
            im.setImage(true);
        else
            im.setImage(false);

    }
}
