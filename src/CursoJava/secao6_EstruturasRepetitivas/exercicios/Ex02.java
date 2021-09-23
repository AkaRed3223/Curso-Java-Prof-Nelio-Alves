package CursoJava.secao6_EstruturasRepetitivas.exercicios;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada
//de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence.
//O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA
//(nesta situação sem escrever mensagem alguma).

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();

        while (X != 0 && Y != 0) {

            if (X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            } else if (X < 0 && Y < 0) { //esse Y < 0 pode ser omitido
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }

            X = input.nextInt();
            Y = input.nextInt();
        }

        input.close();
    }
}





