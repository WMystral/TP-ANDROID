package com.example.maumene.dessin_1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;



public class Dessin extends View {

    private Paint couleur;
    private Paint couleur2;
    private Bitmap bit;
    public Dessin(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.couleur = new Paint();
        this.couleur.setStyle(Paint.Style.FILL);
        this.couleur.setColor(Color.BLUE);
        this.couleur2 = new Paint();
        this.couleur2.setColor(0xff6c2fa0);
        this.couleur2.setAntiAlias(true);
        this.couleur2.setStyle(Paint.Style.STROKE);
        this.couleur2.setStrokeWidth(5);
        this.bit = BitmapFactory.decodeResource(this.getResources(), R.drawable.cercles);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

       canvas.drawRect(100,100,200,200, this.couleur);
       canvas.drawCircle(300,300,50, this.couleur2);
       canvas.drawBitmap(this.bit,400,400, this.couleur);
    }
}
