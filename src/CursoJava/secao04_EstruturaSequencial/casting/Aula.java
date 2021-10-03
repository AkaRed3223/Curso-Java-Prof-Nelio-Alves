package CursoJava.secao04_EstruturaSequencial.casting;

public class Aula {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;
        double resultado = a / b;
        System.out.println(resultado);
        //o resultado deve ser 2 pois o java faz a divisão dos inteiros, desprezando os decimais
        //pra corrigir isso, faça o seguinte:
        int c = 5;
        int d = 2;
        double resultado2 = (double) c / d; //essa conversão explícita chama-se Casting
        System.out.println(resultado2);

        /*double e = 5.5;
        int f = e; //não funciona pois a conversão é impossível
        //para isso usa-se o casting:*/
        double e = 5.5;
        int f = (int) e;
        System.out.println(f);





    }


}
