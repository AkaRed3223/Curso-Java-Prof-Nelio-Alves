package CursoJava.secao17_TrabalhandoComArquivos.a04_FileWriter_BufferedWriter;

//Agora o FileWriter e o BufferedWriter são utilizados para escrever arquivos
//

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A04 {
    public static void main(String[] args) {

        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\temp\\out.txt";

        //try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            //no primeiro try será criado um arquivo novo
            //no segundo será feito um append no arquivo original, caso exista
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}