package CursoJava.secao08_IntroducaoaPOO.ex07_Aluno.entities;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public boolean aprovado() {
        return notaFinal() >= 60;
    }

    public String toString() {
        return "FINAL GRADE = " + String.format("%.2f",notaFinal());
    }
}





