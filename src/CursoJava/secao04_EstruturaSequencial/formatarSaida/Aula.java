package CursoJava.secao04_EstruturaSequencial.formatarSaida;

import java.util.Locale;

public class Aula {

    public static void main(String[] args) {
        //imprimir números com formatação de casas decimais
        double a = 100;
        double b = 3;
        System.out.printf("%.2f%n",a/b); //%n é a quebra de linha
        System.out.printf("Resultado: %.2f metros%n",a/b); //concatenar string e numero no printf


        //para definir o local padrão de formatação de decimais
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n",a/b);

        //abaixo veja a concatenação de vários itens formatados
        //%f para ponto flutuante, %d para inteiro, %s para texto e %n para quebra de linha
        String nome = "Maria";
        int idade = 31;
        double renda = 4000;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);



    }
}

