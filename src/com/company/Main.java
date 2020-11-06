package com.company;

import java.util.Random;

public class Main {

    public Main() {
    }
//creation des objets+initialisation des parametres
    public static void main(String[] args) {
        Hero aventurier = new Hero(200, 100);

        Monsters sorciere = new Monsters("witch", 180, 0);
        Monsters barbare = new Monsters("olaf", 160, 0);//Degat et point attaque sont à 0 car ils prendront les valeurs du random


        System.out.println("Bienvenue dans le dongeon");
        System.out.println("Vous avez " + aventurier.getPointDeVie() + " Point de vie, " + aventurier.getFlasqueDeau() + " flasques pour combatre vos ennemies et une ");

       // i=room ;si pointdevie > room-->room+1 sinon game over(pas besoin de creer une classe)
        int i = 1;
        do {

            if (aventurier.getPointDeVie() > 0) ;
            {
                System.out.println("Room" + i);

                Monsters enemieActuel = barbare;
//nbr aleatoire entre sorcier et monster
                Random random = new Random();
                int nbrAl = random.nextInt(2 );
//si nbr=0 = sorcier sinon barbare
                if (nbrAl == 0) {
                     enemieActuel = sorciere;
                     //sinon barbare
                } else {
                     enemieActuel = barbare;
                }


                //Si barbare faire le do while

                if (enemieActuel == barbare) {

                    do { //Faire des degats aleatoire grace au random à l'aide de l'epee
                        epee.setDegat((int) (5 + (Math.random() * 30)));//comme .set dega=0 on lui donne la valeur de math.random
                        int degat = epee.getDegat(); //.get renvoi la valeur au int nommer degat
                        barbare.setPointDeVie(barbare.getPointDeVie() - degat);//vie - degat
                        System.out.println("Il reste au barbare " + barbare.getPointDeVie());//nouvelle valeur de point de vie


                        //idem avec l'aventurier
                        barbare.setPointAttaque((int) (5 + (Math.random() * 30)));
                        int pointDattaque = barbare.getPointAttaque();
                        aventurier.setPointDeVie(aventurier.getPointDeVie() - pointDattaque);
                        System.out.println("il vous reste " + aventurier.getPointDeVie());

                        // tant que les Pvie de l'aventurier >= 0 et idem barbare continuer le combat
                    } while (aventurier.getPointDeVie() >= 0 && barbare.getPointDeVie() >= 0);
                    //à la fin du combat si pvie de l'aventurier sont >0 et que i (room) egale 5 "gagné"
                    if (aventurier.getPointDeVie() > 0 && i==5) {
                        System.out.println("Bravo vous avez gagné ! =)");

                        //Si juste pvie de l'aventurier > 0 --->room suivante
                    }else if (aventurier.getPointDeVie() > 0 ){
                        System.out.println("Bravo tu passes à la pièce suivante");
                        //on redonne les valeurs de depart pdeVie pour la nouvelle room
                        aventurier.setPointDeVie(200);
                        barbare.setPointDeVie(180);
                        i+=1;
                    }

                    // sinon room = 6 pour envoyer le sout "game over"
                    else {
                        System.out.println("Game Over");
                        i = 6;
                    }



                }

                                   //IDEM avec sorciere
                else {
                    do {


                    aventurier.setFlasqueDeau((int) (5 + (Math.random() * 30)));
                    int degat = aventurier.getFlasqueDeau();
                    sorciere.setPointDeVie(sorciere.getPointDeVie() - degat);
                    System.out.println("Il reste à la sorciere " + sorciere.getPointDeVie());

                    sorciere.setPointAttaque((int) (5 + (Math.random() * 30)));
                    int pointDattaque = sorciere.getPointAttaque();
                    aventurier.setPointDeVie(aventurier.getPointDeVie() - pointDattaque);
                    System.out.println("il vous reste " + aventurier.getPointDeVie());

                } while (aventurier.getPointDeVie() >= 0 && sorciere.getPointDeVie() >= 0);
                if (aventurier.getPointDeVie() > 0 && i==5) {
                    System.out.println("Bravo vous avez gagné ! =)");
                }else if (aventurier.getPointDeVie() > 0 ){
                    System.out.println("Bravo tu passes à la pièce suivante");
                    aventurier.setPointDeVie(200);
                    sorciere.setPointDeVie(160);
                    i+=1;
                }
                else {
                    System.out.println("Game Over");
                    i = 6;
                }
            }
        } } while (i <= 5 && aventurier.getPointDeVie() > 0);


    }


}


