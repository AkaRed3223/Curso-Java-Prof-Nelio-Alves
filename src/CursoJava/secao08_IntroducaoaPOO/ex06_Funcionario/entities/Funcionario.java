package CursoJava.secao08_IntroducaoaPOO.ex06_Funcionario.entities;

public class Funcionario {
    public String nome;
    public double salBruto;
    public double imposto;

    public double salLiquido() {
        return salBruto - imposto;
    }

    public void aumentarSalario(double porcentagem) {
        salBruto += salBruto * (porcentagem / 100);
    }

    public String toString() {
        return nome + ", R$ " + String.format("%.2f,", salLiquido());
    }
}
