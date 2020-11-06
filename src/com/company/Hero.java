package com.company;

public class Hero {
    //initialisation de l'objet
    private int pointDeVie = 200;
    private int flasqueDeau;
//constructor
    public Hero(int ptv, int fde) {
        this.pointDeVie = ptv;
        this.flasqueDeau = fde;
    }
//getter.setter
    public int getPointDeVie() {

        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {

        this.pointDeVie = pointDeVie;
    }

    public int getFlasqueDeau() {

        return flasqueDeau;
    }

    public void setFlasqueDeau(int flasqueDeau) {

        this.flasqueDeau = flasqueDeau;
    }
}