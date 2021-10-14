package CursoJava.secao17_TrabalhandoComArquivos.a06_CaminhoDoArquivo;

//Operações com os caminhos dos arquivos e diretórios

import java.io.File;

public class A06 {
    public static void main(String[] args) {

        String strPath = "C:\\temp\\in.txt";

        File file = new File(strPath);

        System.out.println("getName: " + file.getName()); //mostra o nome do arquivo
        System.out.println("getParent: " + file.getParent()); //mostra o diretório pai
        System.out.println("getPath: " + file.getPath()); //mostra o caminho completo

    }
}
