package CursoJava.secao07_OutrosTopicosBasicos;

 /*Formatar: toLowerCase(), toUpperCase(), trim()
    Recortar: substring(inicio), substring(inicio, fim)
    Substituir: Replace(char, char), Replace(string, string)
    Buscar: IndexOf, LastIndexOf
    str.Split(" ")*/

public class A2_FuncoesLegaisParaStrings {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG ";
        String s01 = original.toLowerCase(); //joga tudo pra minúscula
        String s02 = original.toUpperCase(); //joga tudo pra maiúscula
        String s03 = original.trim(); //corta os espaços ao final da string
        String s04 = original.substring(2); //inicia a string a partir de uma determinada posição
        String s05 = original.substring(2, 9); //inicia e termina a string em determinadas posições
        String s06 = original.replace('a', 'x'); //substitui todas as ocorrências de 'a' pra 'x'
        String s07 = original.replace("abc", "xy"); //substitui todas as ocorrências de "abc" pra "xy"

        int i = original.indexOf("bc"); //i recebe a posição onde estiver a primeira ocorrência de "bc"
        int j = original.lastIndexOf("bc"); //i recebe a posição onde estiver a última ocorrência de "bc"

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////

        String s = "potato apple lemon";
        String[] vect = s.split(" "); //cria um vetor e joga os elementos separados por espaço em uma posição dele
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
    }
}
