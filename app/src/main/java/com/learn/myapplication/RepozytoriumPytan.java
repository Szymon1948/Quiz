package com.learn.myapplication;

import java.util.ArrayList;

public class RepozytoriumPytan {
    public static ArrayList<Pytanie> pytania = new ArrayList<>();
    public void wypelnijPytaniami(){
        pytania.add(new Pytanie("Jakie schronisko na obrazku?","Nad morskim okiem","Na wielkiej raczy","Na Rysiance",1,R.drawable.obraz,"Długi tekst z odpowiedzią"));
    }
}
