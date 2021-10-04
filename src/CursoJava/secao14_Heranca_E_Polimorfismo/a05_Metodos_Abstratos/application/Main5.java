package CursoJava.secao14_Heranca_E_Polimorfismo.a05_Metodos_Abstratos.application;

import CursoJava.secao14_Heranca_E_Polimorfismo.a05_Metodos_Abstratos.entities.Circle;
import CursoJava.secao14_Heranca_E_Polimorfismo.a05_Metodos_Abstratos.entities.Color;
import CursoJava.secao14_Heranca_E_Polimorfismo.a05_Metodos_Abstratos.entities.Rectangle;
import CursoJava.secao14_Heranca_E_Polimorfismo.a05_Metodos_Abstratos.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or circle (r/c)? ");
            char option = input.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(input.next());
            if (option == 'r') {
                System.out.print("Width: ");
                double width = input.nextDouble();
                System.out.print("Height: ");
                double height = input.nextDouble();
                shapeList.add(new Rectangle(color, width, height));
            } else if (option == 'c') {
                System.out.print("Radius: ");
                double radius = input.nextDouble();
                shapeList.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape s : shapeList) {
            System.out.printf("%.2f%n", s.area()); //chamada do método onde cada objeto terá sua própria implementação
        }
    }
}
