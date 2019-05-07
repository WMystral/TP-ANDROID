package com.example.arc_en_ciel;

import android.content.Intent;
import android.view.View;

public class Selection implements View.OnClickListener {
    private Arcenciel arcen;

    public  Selection(Arcenciel arc) {
        this.arcen = arc;
    }
    @Override
    public void onClick(View view) {
        Intent newint = new Intent(this.arcen,ChoixArc.class);
        this.arcen.startActivityForResult(newint,1);

    }
}
