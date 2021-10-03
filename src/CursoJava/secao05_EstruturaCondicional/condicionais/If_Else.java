package CursoJava.secao05_EstruturaCondicional.condicionais;

//A estrutura if else começa igual à if, mas acrescenta um segundo bloco de comandos
//para serem executados caso o primeiro seja falso

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Que horas são?");
        int hora = input.nextInt();

        if (hora < 12) { //condição a ser testada
            System.out.println("Bom dia!");
        } else { //só será executado caso o if seja falso
            System.out.println("Boa tarde!");
        }

        input.close();

    }
}
