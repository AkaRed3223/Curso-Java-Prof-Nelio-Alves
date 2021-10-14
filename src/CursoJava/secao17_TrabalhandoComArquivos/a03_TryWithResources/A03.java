package CursoJava.secao17_TrabalhandoComArquivos.a03_TryWithResources;

//Forma mais simples e otimizada de trabalhar com arquivos

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A03 {
    public static void main(String[] args) {

        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            //aqui tudo foi instanciado junto
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
