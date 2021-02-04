package Bingo;
//************************************************************************
//  Made by        PatrickSys
//  Date           01/02/2021
//  Package        Bingo
//
// Description 
//************************************************************************


import java.util.ArrayList;
import java.util.Random;

public class Machine {

    Random rand = new Random();
    private final int max=100;
    private final int min=1;

    boolean playerWon=false;
    private int number;
    ArrayList<Integer> numbersGenerated = new ArrayList<>();





    //mentres no hi hagi un guanyador s'executara el joc
    public void playBingo(Player player1, Player player2) {


        while (!playerWon) {
            System.out.println("Treim la bolla: " + number);
            number = rand.nextInt((max - min) + min)+1;
            checkNumber(player1, player2);


            }
        }



    //logica de comprovar el numero general, manejar els arraylist...
    private void checkNumber(Player player1, Player player2){


        //quan esta buida el jugador canta bingo

        if(!numbersGenerated.contains(number)) { //comprovam que un numero no es repeteixi


            //si els dos acaben els nombres a la vegada, hi ha empat
            if(player1.cartolina.isEmpty()&player2.cartolina.isEmpty()){
                System.out.println("Hi ha empat!!");
                playerWon=true;
            }

             else if (player1.cartolina.isEmpty()) {

                System.out.println("El jugador " + player1.getName() + " ha canta Bingo!");
                playerWon = true;
            }
             else if(player2.cartolina.isEmpty()){

                System.out.println("El jugador " + player2.getName() + " ha cantat Bingo!!");
                playerWon=true;
            }

            //si el nombre no es repeteix i un jugador el té, el treu de la cartolina i l'entra a la llista de noms generats
            else {


                if (player1.cartolina.contains(number)) {

                    //System.out.println("treim" +number);
                    player1.cartolina.remove((Integer) number);
                    numbersGenerated.add(number);
                }
                if (player2.cartolina.contains(number)) {

                    //System.out.println("treim" +number);
                    player2.cartolina.remove((Integer) number);
                    numbersGenerated.add(number);
                }


            }

        }
    }
    }



