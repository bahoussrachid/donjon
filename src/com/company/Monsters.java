package com.company;

public class Monsters {

    //initialisation de l'objet
    private String nom;
    private int pointDeVie;
    private int pointAttaque;
//constructor
    public Monsters(String nom, int pointDeVie, int pointAttaque) {
        this.nom = nom;
        this.pointDeVie = pointDeVie;
        this.pointAttaque = pointAttaque;
    }
//getter setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public int getPointAttaque() {
        return pointAttaque;
    }

    public void setPointAttaque(int pointAttaque) {
        this.pointAttaque = pointAttaque;
    }
}