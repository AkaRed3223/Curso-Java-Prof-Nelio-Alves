package CursoJava.secao10_ArraysEListas.a03_LacoForEach;

public class ForEach {
    public static void main(String[] args) {

        String[] vect = new String[] {"Cesar", "Mi", "Raja", "Melinha"};
        //vetor criado com 4 objetos do tipo string

        for (String x : vect) { //each pode ser qualquer apelido
            System.out.println(x);
        }
        //para cada x (apelido de cada posição) no vetor vect, imprima x




    }
}
