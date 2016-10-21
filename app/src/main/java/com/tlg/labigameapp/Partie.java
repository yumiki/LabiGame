package com.tlg.labigameapp;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.widget.Button;
import android.widget.Toast;

public class Partie{

    private Robot joueur;
    private Labyrinthe lab;
    private final Handler handler;
    Thread t;
    
    public Partie(Context context){
        handler = new Handler(context.getMainLooper());
        this.t= new Thread(new Runnable() {
            int deltaX,deltaY;
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);

                    while(partieTerminee()==false){
                        deltaX=joueur.position.getX()-lab.arrivee.getX();
                        deltaY=joueur.position.getY()-lab.arrivee.getY();
                        if(Math.abs(deltaX)>Math.abs(deltaY)){
                            if (deltaX>0){
                                if(lab.cases[joueur.position.getX()+1][joueur.position.getY()]==true){
                                    runOnUiThread(new Runnable() {
                                        @Override
                                        public void run() {
                                            Button bu = (Button) findViewById();

                                    });
                                }
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public boolean partieTerminee(){
        return  (joueur.position.x==lab.arrivee.x)&&(joueur.position.y==lab.arrivee.y);
    }


    void lancerPartie(Labyrinthe lab){
        this.lab= lab;
        this.joueur= new Robot();

        joueur.position.setXY(lab.depart.getX(),lab.depart.getY());
        this.t.start();
    }

    private void runOnUiThread(Runnable r) {
        handler.post(r);
    }

}
