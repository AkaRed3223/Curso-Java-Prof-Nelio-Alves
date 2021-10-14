package CursoJava.secao17_TrabalhandoComArquivos.a05_ManipulandoPastas;

//a função listFiles serve para listar os arquivos de uma variável que
//foi utilizada para instanciar um objeto da classe File

import java.io.File;
import java.util.Scanner;

public class A05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strPath = "C:\\temp";
        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        //foi criado um vetor com a listagem de diretórios
        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        //foi criado um vetor com a lista de arquivos
        System.out.println();
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();
        //foi criada uma pasta subdir no caminho indicado
        System.out.println();
        System.out.print("Was the directory created successfully? " + success + "\n");

        sc.close();

    }
}
