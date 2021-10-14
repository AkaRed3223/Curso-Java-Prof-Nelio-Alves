package CursoJava.secao17_TrabalhandoComArquivos.a01_Arquivos;

//O scanner pode receber um arquivo como fonte de dados

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {

        File file = new File("C:\\temp\\in.txt");
        //são necessárias barras duplas pra indicar caminho de diretórios
        Scanner sc = null;
        //foi criada uma variável scanner nula para que a instanciação aconteça
        //dentro de um bloco try

        try {
            sc = new Scanner(file); //instanciado o scanner com o arquivo como fonte
            //uma vez instanciado, todas as operações são feitas a partir do scanner
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            //o scanner só pode ser instanciado com arquivo mediante o tratamento
            //da possível exceção de aquele arquivo não existir
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
