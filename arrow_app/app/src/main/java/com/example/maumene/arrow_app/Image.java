package com.example.maumene.arrow_app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.util.jar.Attributes;


public class Image extends ImageView {


    private Bitmap[] bm;


    public Image(Context context, AttributeSet attrs) {
        super(context, attrs);

    }



    public void setImage(boolean num) {

        if(num)
            this.setImageResource(R.drawable.fleche_gauche);
        else
            this.setImageResource(R.drawable.fleche_droite);

    }


}
