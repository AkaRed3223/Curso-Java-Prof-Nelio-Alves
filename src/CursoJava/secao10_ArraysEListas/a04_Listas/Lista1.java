package CursoJava.secao10_ArraysEListas.a04_Listas;

import java.util.ArrayList;
import java.util.List;

public class Lista1 {
    public static void main(String[] args) {
        //Primeiramente, entenda que listas não aceitam tipos primitivos, por isso o <Integer>

        List<Integer> lista1 = new ArrayList<>();
        //Correta instanciação de uma variável do tipo List chamada lista1
        //ArrayList é uma classe que implementa uma interface de manipulação de listas
        //Dentro dela existem várias funções legais
        System.out.println("lista1 " + lista1); //veja a lista vazia

        List<String> lista2 = new ArrayList<>(); //agora instanciamos uma lista do tipo String
        lista2.add("Cesar");
        lista2.add("Mi");
        lista2.add("Raja");
        lista2.add("Melinha");
        //foram adicionados 4 itens à lista
        System.out.println("lista2 " + lista2);

        List<String> lista3 = new ArrayList<>();
        lista3.add("Cesar");
        lista3.add("Mi");
        lista3.add("Raja");
        lista3.add("Melinha");
        lista3.add(2, "Rashido");
        //foi inserido na posição 2 um elemento Rashido
        System.out.println("lista3 " + lista3);
        System.out.println("tamanho da lista3 = " + lista3.size()); //imprime o tamanho da lista
        lista3.remove(2); //removido o item 1
        System.out.println("removido o item 2 = " + lista3); //perceba o item removido
        lista3.remove("Cesar"); //compara o conteúdo da lista e remove o equivalente
        System.out.println("removido Cesar " + lista3);

    }
}
