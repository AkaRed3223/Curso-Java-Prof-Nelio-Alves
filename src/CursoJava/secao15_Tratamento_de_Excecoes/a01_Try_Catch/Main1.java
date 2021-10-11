package CursoJava.secao15_Tratamento_de_Excecoes.a01_Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        method1();
        System.out.println("End of program");
    }

    public static void method1() {
        System.out.println("***METHOD1 START***"); //Método dentro de outro método
        method2();
        System.out.println("***METHOD1 END***");
    }

    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);
        try {
            //'try' indica o bloco de comandos que deve ser executado
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //'catch' indica os comandos que devem ser executados caso haja uma exceção específica
            //nesse caso é a exceção ArrayIndexOutOfBoundsException
            System.out.println("Invalid position!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            //os catch podem ser cumulativos
            //esse caso aqui trata a exceção InputMismatchException
            System.out.println("Input error");
        }
        sc.close();
        System.out.println("***METHOD2 END***");
    }
}

