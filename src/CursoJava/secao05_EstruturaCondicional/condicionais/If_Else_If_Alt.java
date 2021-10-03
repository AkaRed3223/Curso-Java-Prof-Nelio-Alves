package CursoJava.secao05_EstruturaCondicional.condicionais;

//As estruturas condicionais podem ser encadeadas dentro de outras estruturas condicionais.

import java.util.Scanner;

public class If_Else_If_Alt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Que horas são?");
        int hora = input.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 18) { //quando existe apenas um comando, as chaves podem ser suprimidas
            System.out.println("Boa tarde!");
        } else System.out.println("Boa noite!");

        input.close();

    }
}
