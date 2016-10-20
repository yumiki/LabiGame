package com.tlg.labigameapp;

public class Partie {

    private Robot joueur;
    private Labyrinthe lab;
    
    public Partie(Robot j, Labyrinthe l){
        this.joueur = j;
        this.lab = l;  
    }
    
    public boolean partieTerminee(){
        return  (joueur.position.x==lab.arrivee.x)&&(joueur.position.y==lab.arrivee.y);
    }

    void lancerPartie(Thread t){
        t.start();
    }
}
