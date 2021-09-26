package CursoJava.secao8_IntroducaoaPOO.Ex02_TrianguloComPOO;

//Agora faça o mesmo programa que o Ex01, mas dessa vez utilizando Objetos

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X");
        x.ladoA = input.nextDouble();
        x.ladoB = input.nextDouble();
        x.ladoC = input.nextDouble();

        System.out.println("Enter the measures of triangle Y");
        y.ladoA = input.nextDouble();
        y.ladoB = input.nextDouble();
        y.ladoC = input.nextDouble();

        double px = (x.ladoA + x.ladoB + x.ladoC) / 2;
        double py = (y.ladoA + y.ladoB + y.ladoC) / 2;
        double areax = Math.sqrt(px * (px - x.ladoA) * (px - x.ladoB) * (px - x.ladoC));
        double areay = Math.sqrt(py * (py - y.ladoA) * (py - y.ladoB) * (py - y.ladoC));

        System.out.printf("Triangle X area: %.4f%n",areax);
        System.out.printf("Triangle Y area: %.4f%n",areay);

        if (areax > areay) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        input.close();



    }

}
