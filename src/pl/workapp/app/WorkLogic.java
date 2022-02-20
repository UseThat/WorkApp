package pl.workapp.app;

import pl.workapp.io.DataReader;
import pl.workapp.model.Employee;
import pl.workapp.model.Guest;
import pl.workapp.model.Work;

public class WorkLogic {
    private static final int EXIT = 0;
    private static final int ADD_EMPLOYEE = 1;
    private static final int ADD_GUEST = 2;
    private static final int PRINT_EMPLOYEE = 3;
    private static final int PRINT_GUEST = 4;

    private DataReader dataReader = new DataReader();

    private Work work = new Work();

    public void appLoop() {
        int option;
        do {
            printOptions();
            option = dataReader.getInt();

            switch (option) {
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case ADD_GUEST:
                    addGuest();
                    break;
                case PRINT_EMPLOYEE:
                    printEmployees();
                    break;
                case PRINT_GUEST:
                    printGuests();
                    break;
                case EXIT:
                    System.out.println("Cya!");
                    break;
                default:
                    System.out.println("No option choose. Try again");
            }

        } while (option != EXIT);


    }

    private void printOptions() {
        System.out.println("Choos option: ");
        System.out.println(EXIT + " - exit");
        System.out.println(ADD_EMPLOYEE + " - add employee");
        System.out.println(ADD_GUEST + " - add guest");
        System.out.println(PRINT_EMPLOYEE + " - print employee");
        System.out.println(PRINT_GUEST + " - print guest");
    }

    private void addEmployee(){
        Employee employee = dataReader.readAndCreateEmployee();
        work.addEmployee(employee);
    }

    private void printEmployees() {
        work.printEmployees();
    }

    private void addGuest(){
        Guest guest = dataReader.readAndCreateGuest();
        work.addGuest(guest);
    }

    private void printGuests() {
        work.printGuests();
    }

}
