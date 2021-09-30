package CursoJava.secao10_ArraysEListas.a04_Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista3 {
    public static void main(String[] args) {

        List<String> wagakkiBand = new ArrayList<>();

        wagakkiBand.add("Suzuhana Yuuko");
        wagakkiBand.add("Machiya");
        wagakkiBand.add("Asa");
        wagakkiBand.add("Wasabi");
        wagakkiBand.add("Ninagawa Beni");
        wagakkiBand.add("Kaminaga Daisuke");
        wagakkiBand.add("Ibukuro Kiyoshi");
        wagakkiBand.add("Kurona");

        //Agora vamos filtrar os membros cujos nomes começam com a letra K
        //Para isso temos que criar uma nova lista com essas funções malucas.
        List<String> wgb1 = wagakkiBand.stream().filter(x -> x.charAt(0) == 'K').collect(Collectors.toList());
        for (String each : wgb1) {
            System.out.println(each);
        }
        System.out.println("--------------------");

        String name1 = wagakkiBand.stream().filter(x -> x.charAt(0) == 'W').findFirst().orElse("Ninguém");
        System.out.println("Começam com W: " + name1);
        String name2 = wagakkiBand.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse("Ninguém");
        System.out.println("Começam com G: " + name2);

    }
}
