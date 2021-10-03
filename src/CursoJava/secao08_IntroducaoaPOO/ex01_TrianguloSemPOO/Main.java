package CursoJava.secao08_IntroducaoaPOO.ex01_TrianguloSemPOO;

//A ideia deste exercício é fazer um programa que receba os 3 lados de dois triângulos diferentes,
//calcula suas respectivas áreas e mostre qual tem a maior área.
//MAS SEM UTILIZAR A ORIENTAÇÃO A OBJETOS!

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X");
        double aX = input.nextDouble();
        double bX = input.nextDouble();
        double cX = input.nextDouble();

        System.out.println("Enter the measures of triangle Y");
        double aY = input.nextDouble();
        double bY = input.nextDouble();
        double cY = input.nextDouble();

        double pX = (aX + bX + cX) / 2;
        double pY = (aY + bY + cY) / 2;
        double areaX = Math.sqrt(pX * (pX - aX) * (pX - bX) * (pX - cX));
        double areaY = Math.sqrt(pY * (pY - aY) * (pY - bY) * (pY - cY));

        System.out.printf("Triangle X area: %.4f%n",areaX);
        System.out.printf("Triangle Y area: %.4f%n",areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        input.close();
    }
}
