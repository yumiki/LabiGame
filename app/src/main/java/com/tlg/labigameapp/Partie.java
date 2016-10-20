package com.tlg.labigameapp;

public class Partie {

    private Robot joueur;
    private Labyrinthe lab;
    
    public Partie(Robot j, Labyrinthe l){
        this.joueur = j;
        this.lab = l;  
    }
    
    public boolean partieTerminee(){
        if((joueur.position.x==lab.PointdArrivee
    }
}
