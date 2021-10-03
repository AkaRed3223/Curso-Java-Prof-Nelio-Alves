package CursoJava.secao09_Construtores_this_sobrecarga_encapsulamento.ex03_ProgramaEstoque.entities;

public class Product {

    //EXEMPLO DE SOBRECARGA. Vários construtores dentro de uma mesma classe.

    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
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
