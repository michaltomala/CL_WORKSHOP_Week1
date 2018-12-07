package pl.coderslab.game2;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

    int [] Array = new int [49];
        Array =createArrays();
    int [] userArray = new int[6];
    startgame(userArray);

    }

    static int[] createArrays(){
        int[] newArray = new int [49];
        for(int i=0;i<49;i++){
            newArray[i]=i+1;
            System.out.println(newArray[i]);
        }
        return newArray;
    }
    static void startgame(int[] userArray){
        System.out.println("Hello,it's LOTTO here !");
        int number1 = getInt("Provide a first number: ","Please try again !");
        userArray[number1]
        int number2 = getInt("Provide a second number: ","Please try again !");
        int number3 = getInt("Provide a third number: ","Please try again !");
        int number4 = getInt("Provide a fourth number: ","Please try again !");
        int number5 = getInt("Provide a fifth number: ","Please try again !");
        int number6 = getInt("Provide a sixth number: ","Please try again !");

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
