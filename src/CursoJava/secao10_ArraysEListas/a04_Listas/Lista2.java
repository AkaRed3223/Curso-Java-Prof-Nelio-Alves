package CursoJava.secao10_ArraysEListas.a04_Listas;

import java.util.ArrayList;
import java.util.List;

public class Lista2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Dhalsim");
        list.add("G");
        list.add("Gill");
        list.add("Fang");
        list.add("Seth");
        list.add("Alex");
        list.add("Sakura");

        System.out.println(list);
        //imprime em forma de lista
        System.out.println("----------------------");

        for (String each : list) {
            System.out.println(each);
        } //imprime cada iteração em forma de string
        System.out.println("----------------------");

        //list.indexOf procura um match exato na lista
        System.out.println("Posição do Seth na lista = " + list.indexOf("Seth"));
        System.out.println("Posição do G na lista = " + list.indexOf("G"));
        System.out.println("Posição do Ryu na lista = " + list.indexOf("Ryu")); //não existe
        //o resultado é -1 pois Ryu não foi encontrado na lista
        System.out.println("----------------------");

        list.removeIf(x -> x.charAt(0) == 'G'); //remove todos os itens que começam com G
        //esse foi o primeiro exemplo com uma função lambda
        for (String each : list) {
            System.out.println(each);
        }
        System.out.println("----------------------");










    }
}
