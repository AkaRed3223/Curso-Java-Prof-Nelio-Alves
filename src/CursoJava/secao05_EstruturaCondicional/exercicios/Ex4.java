package CursoJava.secao05_EstruturaCondicional.exercicios;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
//sabendo que o mesmo pode começar em um dia e terminar em outro,
//tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horaInicial = input.nextInt();
        int horaFinal = input.nextInt();
        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        input.close();

    }

}
