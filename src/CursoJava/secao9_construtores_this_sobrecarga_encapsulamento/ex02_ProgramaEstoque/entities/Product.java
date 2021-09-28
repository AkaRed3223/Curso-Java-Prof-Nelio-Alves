package CursoJava.secao9_construtores_this_sobrecarga_encapsulamento.ex02_ProgramaEstoque.entities;

public class Product {

    //EXEMPLO DE SOBRECARGA. Vários construtores dentro de uma mesma classe.

    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        //não é necessário declarar o this.quantity pois está implícito
    }

    public Product(){
        //construtor vazio (padrão)
    }

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ "
                + String.format("%.2f", price)
                + ", " + quantity
                + " units. Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
