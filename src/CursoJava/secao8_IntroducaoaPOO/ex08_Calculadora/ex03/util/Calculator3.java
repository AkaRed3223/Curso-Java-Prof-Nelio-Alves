package CursoJava.secao8_IntroducaoaPOO.ex08_Calculadora.ex03.util;

public class Calculator3 {

    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3;
    }

}
