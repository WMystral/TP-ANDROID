package com.example.maumene.choixevent;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;

import java.util.concurrent.CancellationException;

public class Forme extends View {
        private Paint ff;
        private Paint couleurT;
        private RadioGroup radiog;
        private int checkedidbutton;

        public Forme(Context c, AttributeSet as) {
            super(c,as);
            ff = new Paint();
            ff.setColor(Color.RED);
            ff.setStyle(Paint.Style.FILL);

            couleurT = new Paint();
            couleurT.setStrokeWidth(4);
            couleurT.setColor(android.graphics.Color.RED);
            couleurT.setStyle(Paint.Style.FILL_AND_STROKE);
            couleurT.setAntiAlias(true);

            this.checkedidbutton=R.id.carre;

        }

        public void setRadioGroup(RadioGroup rg) {
            this.radiog = rg;
        }

        public void setIdChecked(int i) {
            this.checkedidbutton = i;
            this.invalidate();
        }

        @Override
        public void onDraw(Canvas canvas) {


            if(this.checkedidbutton == R.id.carre) {
                canvas.drawRect(new Rect(100,100,150,150),ff);
            }else if(this.checkedidbutton == R.id.rond) {
                canvas.drawOval(new RectF(100,100,150,150),ff);
            }else if(this.checkedidbutton == R.id.triangle) {

                drawTriangle(canvas, this.ff, this.getWidth()/2, this.getHeight()/2,200);


            }else if(this.checkedidbutton == R.id.croix) {
                canvas.drawLine(0.0F,0.0F,100.0F,100.0F,ff);
                canvas.drawLine(0.0F,100.0F,100.0F,0.0F,ff);
            }else {
                canvas.drawRect(new Rect(100,100,150,150),ff);
            }
        }

        private void drawTriangle(Canvas c, Paint p, int x, int y, int width) {
            int halfWidth = width/2;
            Path path = new Path();
            path.moveTo(x,y-halfWidth); //top
            path.lineTo(x-halfWidth, y+halfWidth); //bottom left
            path.lineTo(x + halfWidth, y+halfWidth); //bottom right
            path.lineTo(x, y-halfWidth); //back to top

            path.close();

            c.drawPath(path,p);



        }
    }


