package com.company;

public class Hero {
    //initialisation de l'objet
    private int pointDeVie;
    private int flasqueDeau;
    Equipement epee;
//constructor
    public Hero(int ptv, int fde) {
        this.pointDeVie = ptv;
        this.flasqueDeau = fde;
        this.epee= new Equipement("epee", 0);
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