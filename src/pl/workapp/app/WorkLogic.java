package pl.workapp.app;

import pl.workapp.io.DataReader;
import pl.workapp.model.Employee;
import pl.workapp.model.Guest;
import pl.workapp.model.Work;

public class WorkLogic {
   private DataReader dataReader = new DataReader();

    private Work work = new Work();

    public void appLoop() {
        Option option;
        do {
            printOptions();
            option = Option.createFromInt(dataReader.getInt());

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

        } while (option != Option.EXIT);


    }

    private void printOptions() {
        System.out.println("Choos option: ");
        for(Option option: Option.values()){
            System.out.println(option);
        }
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
