package CursoJava.secao4_EstruturaSequencial.scanner;

import java.util.Scanner;

public class Aula {
    public static void main(String[] args) {
        //para criar um objeto que recebe a entrada do teclado, usa-se:
        Scanner input = new Scanner(System.in); //perceba o import do pacote lá em cima
        //"input" é o nome do objeto, "new" significa que o scanner está sendo instanciado

        String nome;
        System.out.print("Digite seu nome: ");
        nome = input.next(); //a variável "nome" receberá a palavra que for digitada pelo teclado
        //pode usar input.next() para capturar apenas uma palavra, sem espaços
        //perceba que ao rodá-lo, o programa ficará parado aguardando o input

        String texto;
        System.out.print("Digite um texto: ");
        input.nextLine(); //é necessário um input.nextLine() vazio antes pois esse comando recebe o ENTER
        //da entrada anterior e quebra tudo.
        texto = input.nextLine();

        char sobrenome;
        System.out.print("Digite seu sobrenome: ");
        sobrenome = input.next().charAt(0); //o input recebe apenas o primeiro caracter da string

        int inteiro;
        System.out.print("Digite um número inteiro: ");
        inteiro = input.nextInt(); //recebe inteiro

        double quebrado;
        System.out.print("Digite um número flutuante: "); //aqui a casa decimal deve ser separada por vírgula
        quebrado = input.nextDouble(); //recebe double

        System.out.println("Seu nome é: " + nome);
        System.out.println("Texto digitado: " + texto);
        System.out.println("A inicial do seu sobrenome é: " + sobrenome);
        System.out.println("Inteiro digitado: " + inteiro);
        System.out.printf("Número flutuante digitado: %.2f", quebrado);

        //para que a casa decimal do input seja recebida com ponto,
        //basta inserir a entrada abaixo antes da declaração do scanner
        //Locale.setDefault(Locale.US);

        input.close(); //fechar o objeto scanner para limpar o buffer e liberar a memória
    }
}
