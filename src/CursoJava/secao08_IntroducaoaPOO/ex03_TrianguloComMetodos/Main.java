package CursoJava.secao08_IntroducaoaPOO.ex03_TrianguloComMetodos;

//Agora faça o mesmo programa do Ex01, mas dessa vez implementando um método para calcular a área

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

        double areaX = x.area(); //criar uma variável para receber o resultado do método
        double areaY = y.area(); //de forma a se evitar ficar chamando o método

        System.out.printf("Triangle X area: %.4f%n",areaX);
        System.out.printf("Triangle Y area: %.4f%n",areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        input.close();
    }

}
