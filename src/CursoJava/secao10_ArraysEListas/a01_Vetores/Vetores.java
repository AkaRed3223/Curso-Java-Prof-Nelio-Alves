package CursoJava.secao10_ArraysEListas.a01_Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] vetor1 = new double[3];
        //double[] indica que o tipo da variável é um vetor que recebe double;
        //nomeDoVetor é o nome da variável
        //new double[5] instancia o vetor com 5 posições
        //--------------------------------------------------------------------//

        String[] vetor2 = new String[] {"Cesar", "Mi", "Raja", "Melinha"};
        //instanciado um vetor do tipo String já com suas 4 posições ocupadas
        //--------------------------------------------------------------------//

        int n = 5;
        int[] vetor3 = new int[n];
        //foi instanciado um vetor com 'n' posições. Esse 'n' pode ser inputado pelo scanner.

        for (int i = 0; i < n; i++) {
            vetor3[i] = input.nextInt();
            //para cada iteração será solicitado um inteiro para preencher cada posição.
        }

        System.out.println(Arrays.toString(vetor3)); //imprime todas as posições do vetor3

        for (int each : vetor3) {
            System.out.println(each);
        } //imprime cada iteração

        input.close();
    }
}
