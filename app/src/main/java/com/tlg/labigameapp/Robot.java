package com.tlg.labigameapp;

public class Robot {

    Point position;

    public void deplacerHaut(){
        
    this.position.y=this.position.y+1; 
        
    }

    public void deplacerBas(){
        
        this.position.y=this.position.y-1;
    }
    
    public void deplacerGauche(){
        
        this.position.x=this.position.x-1;
    }
    
     public void deplacerDroite(){
        
        this.position.x=this.position.x+1;
    }

}
