package CursoJava.secao14_Heranca_E_Polimorfismo.a05_Metodos_Abstratos.entities;

public abstract class Shape {
    //Passo 1:
    //Um método abstrato (area()) só pode ser implementado em uma classe abstrata
    //O método abstrato não possui implementação. Sua implementação ocorre na classe específica.

    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract Double area();

}
