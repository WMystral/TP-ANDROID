package fr.demartin.jordan.tp4ex2n;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;

public class LaVue extends View {
    private Paint[] je_suis_de_la_peinture_pour_figure;
    private int[] etat_carree = new int[9];

    public LaVue(Context context, AttributeSet attrs){
        super(context,attrs);
        for(int i = 0;i < 9;i++){
            etat_carree[i]=i%4;
        }
        this.je_suis_de_la_peinture_pour_figure = new Paint[4];
        this.je_suis_de_la_peinture_pour_figure[0] = new Paint();
        this.je_suis_de_la_peinture_pour_figure[0].setARGB(255,0,0,255);

        this.je_suis_de_la_peinture_pour_figure[1] = new Paint();
        this.je_suis_de_la_peinture_pour_figure[1].setARGB(255,255,255,0);

        this.je_suis_de_la_peinture_pour_figure[2] = new Paint();
        this.je_suis_de_la_peinture_pour_figure[2].setARGB(255,128,0,128);

        this.je_suis_de_la_peinture_pour_figure[3] = new Paint();
        this.je_suis_de_la_peinture_pour_figure[3].setARGB(255,80,80,80);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(0,0,getWidth(),getHeight(),this.je_suis_de_la_peinture_pour_figure[3]);

        for(int i = 0;i < 9;i++){
            canvas.drawRect((i%3)*240,(i/3)*240,(i%3)*240+192,(i/3)*240+192,je_suis_de_la_peinture_pour_figure[etat_carree[i]]);
        }

    }

    public void changeCouleur(int x,int y,int couleur){
        for(int i = 0;i < 9;i++){
            if(x>(i%3)*240 && x<(i%3)*240+192 && y>(i/3)*240 && y<(i/3)*240+192){
                etat_carree[i]=couleur;
            }
        }
        invalidate();
    }


}
