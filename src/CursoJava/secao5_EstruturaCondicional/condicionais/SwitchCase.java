package CursoJava.secao5_EstruturaCondicional.condicionais;

//A estrutura switch/case é uma sintaxe que utiliza uma variável como se fosse um switch.
//A variável é monitorada, e muda de acordo com o valora atribuído a ela, como se fosse um menu.

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String dia;
        int num = input.nextInt(); //numero a ser monitorado

        switch (num) { //aqui informamos ao sistema que nosso sistema é a variável "num"
            case 1: //caso o valor de "num" seja "1", acontece isso:
                System.out.println("Domingo");
                break; //pára a execução do sistema e vai direto pro final
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default: //valor padrão caso nenhum das outras opções sejam acionadas
                System.out.println("Opção inválida");
                break;
        }
        input.close();
    }
}
