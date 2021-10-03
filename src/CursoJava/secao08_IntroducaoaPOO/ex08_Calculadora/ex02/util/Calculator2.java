package CursoJava.secao08_IntroducaoaPOO.ex08_Calculadora.ex02.util;

public class Calculator2 {

    public final double PI = 3.14159;

    public double circumference(double radius) {
        return 2 * PI * radius;
    }

    public double volume(double radius) {
        return 4 * PI * radius * radius * radius / 3;
    }
}
