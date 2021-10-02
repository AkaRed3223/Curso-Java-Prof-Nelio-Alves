package CursoJava.secao13_Enums_Composicao.ex01_Composicoes.program;

import CursoJava.secao13_Enums_Composicao.ex01_Composicoes.entities.Department;
import CursoJava.secao13_Enums_Composicao.ex01_Composicoes.entities.HourContract;
import CursoJava.secao13_Enums_Composicao.ex01_Composicoes.entities.Worker;
import CursoJava.secao13_Enums_Composicao.ex01_Composicoes.entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String workerDepartment = input.nextLine();
        System.out.println("Enter worker's data:");
        System.out.print("Name: ");
        String workerName = input.nextLine();
        System.out.print("Level: ");
        String workerLevel = input.nextLine();
        System.out.print("Base Salary: ");
        Double workerBaseSalary = input.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(workerDepartment));

        System.out.print("How many contracts to this worker? ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractdate = sdf.parse(input.next());
            System.out.print("Value per hour: ");
            Double valuePerHour = input.nextDouble();
            System.out.print("Duration (hours): ");
            Integer hours = input.nextInt();
            HourContract contract = new HourContract(contractdate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = input.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year,month)));

        input.close();
    }
}
