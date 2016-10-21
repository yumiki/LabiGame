package com.tlg.labigameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Labyrinthe lab= new Labyrinthe();
        Log.v("test",lab.cases[5][6]+"");
        Partie Jeu=new Partie(MainActivity.this);
        Jeu.lancerPartie(lab);
    }
}
