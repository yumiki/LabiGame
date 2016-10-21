package com.tlg.labigameapp;

public class Robot {

    protected Point position;

    public void deplacerHaut(){
        
        this.position.setY(this.position.getY()+1);
        
    }

    public void deplacerBas(){
        
        this.position.setY(this.position.getY()-1);
    }
    
    public void deplacerGauche(){
        
        this.position.setX(this.position.getX()-1);
    }
    
     public void deplacerDroite(){
        
        this.position.setX(this.position.getX()+1);
    }

}
