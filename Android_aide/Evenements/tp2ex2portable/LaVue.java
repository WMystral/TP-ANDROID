package fr.demartin.jordan.tp2ex2portable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class LaVue extends View {
    private Paint je_suis_de_la_peinture_pour_figure;
    private String nom_figure;

    public LaVue(Context context, AttributeSet attrs){
        super(context,attrs);

        this.nom_figure = "";
        this.je_suis_de_la_peinture_pour_figure = new Paint();
        this.je_suis_de_la_peinture_pour_figure.setStyle(Paint.Style.STROKE);
        this.je_suis_de_la_peinture_pour_figure.setStrokeWidth(5);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        System.out.println("je suis la et on m'appelle :"+this.nom_figure);
        if(this.nom_figure.equals("cercle")){
            System.out.println("je suis la");
            canvas.drawCircle(200,200,100,je_suis_de_la_peinture_pour_figure);
        }else if(this.nom_figure.equals("carree")){
            canvas.drawRect(50,50,100,100,je_suis_de_la_peinture_pour_figure);
        }else if(this.nom_figure.equals("croix")){
            canvas.drawLine(20,20,120,120,je_suis_de_la_peinture_pour_figure);
            canvas.drawLine(20,120,120,20,je_suis_de_la_peinture_pour_figure);
        }else if(this.nom_figure.equals("triangle")){
            canvas.drawLine(20,20,20,120,je_suis_de_la_peinture_pour_figure);
            canvas.drawLine(20,120,70,120,je_suis_de_la_peinture_pour_figure);
            canvas.drawLine(70,120,20,20,je_suis_de_la_peinture_pour_figure);
        }
    }

    public void changeFigure(String nom){
        this.nom_figure = nom;
        this.invalidate();
    }
}
