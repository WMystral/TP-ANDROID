package com.example.maumene.poids;

import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

public class Rond {
    private float posX;
    private float posY;
    private int index;
    private Paint color;
    private static Random rand = new Random();

    public Rond(int ind,float x,float y) {
        posX = x;
        posY =y;
        this.index = ind;
        this.color = new Paint();
        this.color = new Paint();
        this.color.setARGB(255,rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
    }


    public void setPosX(float x) {
        this.posX = x;
    }
    public void setPosY(float y) {
        this.posY = y;
    }
    public float getPosX() {
        return this.posX;
    }
    public float getPosY() {
        return this.posY;
    }

    public Paint getPaint(){
        return this.color;
    }

    public int getIndex() {
        return this.index;
    }

}