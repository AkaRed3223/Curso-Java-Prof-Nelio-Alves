package CursoJava.secao8_IntroducaoaPOO.ex05_Retangulo.entities;

public class Retangulo {

    public double largura;
    public double altura;


    public double area() {
        return altura * largura;
    }

    public double perimetro() {
        return (altura + largura) * 2;
    }

    public double diagonal() {
        return Math.sqrt((altura * altura) + (largura * largura));
    }

    public String toString() {
        return "AREA = " + String.format("%.2f%n",area())
                + "PERIMETRO = " + String.format("%.2f%n", perimetro())
                + "DIAGONAL = " + String.format("%.2f%n", diagonal());

    }

}
