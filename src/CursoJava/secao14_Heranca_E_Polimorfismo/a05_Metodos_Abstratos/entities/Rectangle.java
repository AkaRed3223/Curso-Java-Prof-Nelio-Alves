package CursoJava.secao14_Heranca_E_Polimorfismo.a05_Metodos_Abstratos.entities;

public class Rectangle extends Shape{

    private Double width;
    private Double height;

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double area() {
        return width * height;
    }
    //Passo 2: método abstrato area() implementado com os parâmetros da classe Rectangle
}
