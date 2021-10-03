package CursoJava.secao07_outrosTopicosBasicos;

//Aqui é onde o caldo começa a engrossar...

import java.util.Scanner;

public class A3_Funcoes {

    //A função 'max' verifica qual é o maior de 3 valores e o guarda como inteiro na variável 'aux'
    //por isso o 'int' antes do nome da função
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && y > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    //A função abaixo simplesmente executa a ação de mostrar na tela a mensagem abaixo
    //por isso o termo 'void'. Pois ele apenas executa uma ação "em branco"
    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int higher = max(a,b,c); //salva na variável 'higher' o resultado da função 'max' mas com os valores de a, b e c

        showResult(higher); //mostra o resultado, mas com o valor da variável 'higher'

        input.close();

    }

}
