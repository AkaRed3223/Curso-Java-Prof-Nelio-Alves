package CursoJava.secao18_Interfaces.a03_herdarOuCumprir_SemInterface.model.entities;

import CursoJava.secao18_Interfaces.a03_herdarOuCumprir_SemInterface.model.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();

}
