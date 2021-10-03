package CursoJava.secao08_IntroducaoaPOO.ex05_Retangulo.program;

import CursoJava.secao08_IntroducaoaPOO.ex05_Retangulo.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Entre a altura e largura do retângulo:");
        retangulo.altura = input.nextDouble();
        retangulo.largura = input.nextDouble();

        System.out.println(retangulo);

        input.close();

    }

}
