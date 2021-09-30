package CursoJava.secao10_ArraysEListas.ex04_DesafioEmployee.program;

import CursoJava.secao10_ArraysEListas.ex04_DesafioEmployee.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ":");
            System.out.print("ID: ");
            int id = input.nextInt();
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Salary: ");
            double salary = input.nextDouble();
            list.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee ID that will have salary increase: ");
        int id = input.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This ID does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = input.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Employee obj : list) {
            System.out.println(obj);
        }

        input.close();

    }

}
