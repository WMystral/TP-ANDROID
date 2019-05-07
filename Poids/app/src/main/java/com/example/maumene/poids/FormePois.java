package com.example.maumene.poids;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class FormePois extends View {

    private int posx;
    private int posy;
    private int pid;
    private ArrayList<Rond> liste_rond;


    public FormePois(Context c, AttributeSet as) {
        super(c,as);

        this.liste_rond = new ArrayList<Rond>();
        this.posx=0;
        this.posy=0;
        this.pid=0;


    }

    public void addCircle(int i, float x, float y){
        this.liste_rond.add(new Rond(i,x,y));

    }

    public void removeCircle(int i) {
       int currentI =-1;

       Log.d("debug","remove");

       for(int p=0 ; p<liste_rond.size() ; p++) {

            if(this.liste_rond.get(p).getIndex() == i) {
                currentI = p;
            }
       }
        if(currentI ==-1){
            Log.e("e","id inconnue"+i);
        }
        else{
            this.liste_rond.remove(currentI);

        }

    }

    public void moveCircle(int id, float x, float y) {
        int currentIndex=-1;

        for(int p=0 ; p<this.liste_rond.size() ; p++) {
            if(this.liste_rond.get(p).getIndex() == id) {
                currentIndex = p;
            }

            if(currentIndex != -1) {
                this.liste_rond.get(currentIndex).setPosX(x);
                this.liste_rond.get(currentIndex).setPosY(y);
            } else {

                Log.d("debug","index inconnu move");
            }
        }

    }

    @Override
    public void onDraw(Canvas c) {

        for(int i=0 ; i<liste_rond.size() ; i++) {
            c.drawCircle(liste_rond.get(i).getPosX(), liste_rond.get(i).getPosY(), 100.0F, liste_rond.get(i).getPaint());
    }

    }

}
