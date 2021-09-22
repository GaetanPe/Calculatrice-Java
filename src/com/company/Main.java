package com.company;

import java.util.Scanner;

public class Main {
    public static void Calculatrice(int x, int y, String operateur) {

        switch (operateur){
            case "+":
                int z  = x +y;
                System.out.println(z);
                break;
            case "*":
                int t = x * y;
                System.out.println(t);

                break;
            case "-":
                int u = x-y;
                System.out.println(u);
                break;
        }
    }
    public static void main(String[] args) {
	// write your code here
        Scanner nombre1 = new Scanner(System.in);
        System.out.println("entrer le premier nombre");
        int x = nombre1.nextInt();
        Scanner nombre2 = new Scanner(System.in);
        System.out.println("entrer le second nombre");
        int y= nombre2.nextInt();
        Scanner signe = new Scanner(System.in);
        System.out.println("entrer le type de calcul");
        String operateur= signe.next();
        Calculatrice(x,y,operateur);
    }


}
