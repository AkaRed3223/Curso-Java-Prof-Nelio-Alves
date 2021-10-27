package CursoJava.secao18_Interfaces.a04_herdarOuCumprir_ComInterface.model.entities;

import CursoJava.secao18_Interfaces.a03_herdarOuCumprir_SemInterface.model.enums.Color;

public abstract class AbstractShape implements Shape{

    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
