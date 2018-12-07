package pl.coderslab.game1;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        game(randomNumbers());
    }


    static int randomNumbers(){

        Random r = new Random();
        int random = r.nextInt(100)+1;
        return random;
    }

    static void game(int randomNumber){
        System.out.println("Hello, I picked number from within a range of 1-100.Guess what :) ?");

        while(true){
            int choice = getInt("Provide a number: ","Please try again !");
            if(choice>randomNumber){
                System.out.println("Well,it's too much");
            }else if(choice<randomNumber){
                System.out.println("Well,it's too little");
            }else{
                System.out.println("Yeah, you won!");
                break;
            }

        }

    }

    static public int getInt(String promptText, String errorText){
        Scanner scan = new Scanner(System.in);

        System.out.println(promptText);
        while (!scan.hasNextInt()){
            scan.next();
            System.out.println(errorText);
        }

        return scan.nextInt();
    }

}
