package pl.workapp.io;

import pl.workapp.model.Employee;
import pl.workapp.model.Guest;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner = new Scanner(System.in);

    private void close(){
        scanner.close();
    }

    public int getInt(){
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public Employee readAndCreateEmployee(){
        System.out.println("Set Employee first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Set Employee last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Set Employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Set Employee email: ");
        String companyEmail = scanner.nextLine();
        System.out.println("Set Employee phone: ");
        String companyPhone = scanner.nextLine();

        return new Employee(firstName, lastName, salary, companyEmail, companyPhone);
    }

    public Guest readAndCreateGuest(){
        System.out.println("Set Guest first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Set Guest last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Set Guest email: ");
        String email = scanner.nextLine();
        System.out.println("Set Guest phone: ");
        String phone = scanner.nextLine();

        return new Guest(firstName, lastName, email, phone);
    }
}
