package CursoJava.secao15_Tratamento_de_Excecoes.a02_Finally;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        File file = new File("C:\\Windows\\temp\\in.txt"); //executa um arquivo dentro do programa
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) { //vai percorrer o arquivo e imprimir todas as linhas dele
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) { //código a ser executado caso haja o erro IOException
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            //A estrutura 'finally' indica um bloco de código que será executado
            //independentemente da existência ou não de exceções
            if (sc != null) {
                sc.close();
            }
            System.out.println("'Finally' block executed");
        }
    }
}

