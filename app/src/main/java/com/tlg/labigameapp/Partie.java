package com.tlg.labigameapp;

public class Partie {

    private Robot joueur;
    private Labyrinthe lab;
    
    public Partie(){
    }
    
    public boolean partieTerminee(){
        return  (joueur.position.x==lab.arrivee.x)&&(joueur.position.y==lab.arrivee.y);
    }

    void lancerPartie(Thread t){
        int distA,distB,distc;

        lab= new Labyrinthe();
        joueur= new Robot();

        joueur.position.setXY(lab.depart.getX(),lab.depart.getY());
        while(partieTerminee()==false){
            distA=Math.abs(joueur.position.getX()-lab.arrivee.getX());
            distB=Math.abs(joueur.position.getY()-lab.arrivee.getY());
            if(distA>distB){
                if(lab.cases[joueur.position.getX()][joueur.position.getY()]==true){

                }
            }
        }
        t.start();
    }
}
