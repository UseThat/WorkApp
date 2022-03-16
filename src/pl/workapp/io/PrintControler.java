package pl.workapp.io;

import pl.workapp.model.Employee;
import pl.workapp.model.Guest;
import pl.workapp.model.Person;

public class PrintControler {
    public void printLine(String string){
        System.out.println(string);
    }

    public void printEmployee(Person[] persons){
        int counter = 0;
        for(Person person : persons){
            if(person instanceof Employee){
                printLine(person.toString());
                counter ++;
            }

        }
        if(counter>0)
            printLine("No employee in company!");
    }

    public void printGuest(Person[] persons){
        int counter = 0;
        for(Person person : persons){
            if(person instanceof Guest){
                printLine(person.toString());
                counter ++;
            }

        }
        if(counter>0)
            printLine("No guest in company!");
    }

}
