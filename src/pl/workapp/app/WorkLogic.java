package pl.workapp.app;

import pl.workapp.exception.NoSuchOptionException;
import pl.workapp.io.DataReader;
import pl.workapp.io.PrintControler;
import pl.workapp.model.Employee;
import pl.workapp.model.Guest;
import pl.workapp.model.Work;

import java.util.InputMismatchException;

public class WorkLogic {
    private PrintControler printer = new PrintControler();
   private DataReader dataReader = new DataReader(printer);

    private Work work = new Work();

    public void appLoop() {
        Option option;
        do {
            printOptions();
            option = getOption();

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

    private Option getOption(){
        boolean optionOk = false;
        Option option = null;
        while(!optionOk){
            try{
                option = Option.createFromInt(dataReader.getInt());
                optionOk = true;
            } catch (NoSuchOptionException e) {
                printer.printLine(e.getMessage()+ ", choose one again.");
            } catch (InputMismatchException e){
                printer.printLine("Please choose number one more time. ");
            }
        }
        return option;
    }

    private void addEmployee(){
        try{
            Employee employee = dataReader.readAndCreateEmployee();
            work.addEmployee(employee);
        }catch (InputMismatchException e){
            printer.printLine("Unable to create employee!");
        }catch (ArrayIndexOutOfBoundsException e){
            printer.printLine("Unable to add new employee. Max capacity!");
        }

    }

    private void printEmployees() {
        work.printEmployees();
    }

    private void addGuest(){
        try{
            Guest guest = dataReader.readAndCreateGuest();
            work.addGuest(guest);
        }catch (ArrayIndexOutOfBoundsException e){
            printer.printLine("Unable to add new guest. Max capacity!");
        }

    }

    private void printGuests() {
        work.printGuests();
    }

}
