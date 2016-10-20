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

        cases[0][3]=true;
        cases[1][3]=true;
        cases[2][3]=true;
        cases[3][3]=true;
        cases[3][4]=true;
        cases[4][4]=true;
        cases[5][4]=true;
        cases[5][5]=true;
        cases[6][5]=true;
        cases[7][5]=true;

        depart.setX(0);
        depart.setY(3);

        arrivee.setX(7);
        arrivee.setY(5);
    }

}
