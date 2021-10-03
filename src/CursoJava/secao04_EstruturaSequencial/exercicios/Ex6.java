package CursoJava.secao04_EstruturaSequencial.exercicios;

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
//Em seguida, calcule e mostre:
//a área do triângulo retângulo que tem A por base e C por altura.
//a área do círculo de raio C. (pi = 3.14159)
//a área do trapézio que tem A e B por bases e C por altura.
//a área do quadrado que tem lado B.
//a área do retângulo que tem lados A e B.

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        final double pi = 3.14159;
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double areaTriangulo = (A * C) / 2;
        double areaCirculo = pi * Math.pow(C, 2);
        double areaTrapezio = ((A + B) / 2) * C;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n",areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n",areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n",areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n",areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n",areaRetangulo);

        input.close();

    }
}
