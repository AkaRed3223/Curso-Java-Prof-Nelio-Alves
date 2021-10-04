package CursoJava.secao14_Heranca_E_Polimorfismo.ex01_Employees.application;

import CursoJava.secao14_Heranca_E_Polimorfismo.ex01_Employees.entities.Employee;
import CursoJava.secao14_Heranca_E_Polimorfismo.ex01_Employees.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char out = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            String empName = input.nextLine();
            System.out.print("Hours: ");
            Integer empHours = input.nextInt();
            System.out.print("Value per hour: ");
            Double empValuePerHour = input.nextDouble();

            if (out == 'n') {
                employees.add(new Employee(empName, empHours, empValuePerHour));

            } else {
                System.out.print("Additional charge: ");
                Double empAdditionalCharge = input.nextDouble();
                employees.add(new OutsourcedEmployee(empName, empHours, empValuePerHour, empAdditionalCharge));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        input.close();
    }
}
