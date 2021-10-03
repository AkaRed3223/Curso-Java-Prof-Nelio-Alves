package CursoJava.secao08_IntroducaoaPOO.ex03_TrianguloComMetodos;

public class Triangle {

    public double ladoA;
    public double ladoB;
    public double ladoC;

    public double area() {

        double p = (ladoA + ladoB + ladoC) / 2; //cálculo de perímetro
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));

    }

}
