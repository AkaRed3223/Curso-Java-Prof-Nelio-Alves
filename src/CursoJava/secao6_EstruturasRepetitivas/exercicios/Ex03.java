package CursoJava.secao6_EstruturasRepetitivas.exercicios;

//Escreva um algoritmo que receba um tipo de combustível da seguinte forma:
//1 - Álcool / 2 - Gasolina / 3 - Diesel
//A tecla 4 "sai do menu" e mostra um resumo dos abastecimentos feitos no dia

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha sua opção");
        System.out.println("1 - Álcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Finalizar");

        int alcool = 0, gasolina = 0, diesel = 0;
        int cod = input.nextInt();

        while (cod != 4) {

            if (cod == 1) {
                alcool++;

            } else if (cod == 2) {
                gasolina++;

            } else if (cod == 3) {
                diesel++;

            }

            cod = input.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        input.close();
    }
}