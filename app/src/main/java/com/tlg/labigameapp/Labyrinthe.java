package com.tlg.labigameapp;

public class Labyrinthe {


    Point depart;
    Point arrivee;
    boolean[][] cases;


    public void generer(){

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++) {
                cases[i][j]=false;
            }
        }


    }

}
