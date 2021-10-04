package CursoJava.secao14_Heranca_E_Polimorfismo.a05_Metodos_Abstratos.entities;

public class Circle extends Shape {

    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * (radius * radius);
    }
    //Passo 3: método abstrato area() agora implementado com os parâmetros da classe Circle
}
