package CursoJava.secao08_IntroducaoaPOO.ex07_Aluno.program;

import CursoJava.secao08_IntroducaoaPOO.ex07_Aluno.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno();

        aluno.nome = input.nextLine();
        aluno.nota1 = input.nextDouble();
        aluno.nota2 = input.nextDouble();
        aluno.nota3 = input.nextDouble();
        double notaFinal = (double) 60 - aluno.notaFinal();

        System.out.println(aluno);

        if (aluno.aprovado()) {
            System.out.println("PASS");
        } else {
            System.out.printf("FAILED\nMISSING %.2f POINTS", notaFinal);
        }

        input.close();

    }
}
