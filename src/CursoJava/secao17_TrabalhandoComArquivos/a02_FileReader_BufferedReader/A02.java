package CursoJava.secao17_TrabalhandoComArquivos.a02_FileReader_BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A02 {
    public static void main(String[] args) {

        String path = "C:\\temp\\in.txt";
        BufferedReader br = null; //classe mais flexível para trabalhar com arquivos
        FileReader fr = null;

        try {
            fr = new FileReader(path); //FileReader é instanciado com o arquivo
            br = new BufferedReader(fr); //BufferedReader é instanciado com o FileReader

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally { //fechar os br e fr também exige um tratamento de exceção
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
