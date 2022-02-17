package pl.workapp.model;

public class Work {
    private static final int EMPLOYEE_CAPACITY = 100;
    private static final int GUEST_CAPACITY = 10;
    private Employee [] employees = new Employee[EMPLOYEE_CAPACITY];
    private Guest [] guests = new Guest[GUEST_CAPACITY];
    private int employeeCounter;
    private int guestCounter;

    public void addEmployee(Employee employee){
        if(employeeCounter < EMPLOYEE_CAPACITY){
            employees[employeeCounter] = employee;
            employeeCounter ++;
        }else{
            System.out.println("Max employee capacity.");
        }
    }

    public void printEmployees(){
        if(employeeCounter == 0){
            System.out.println("No employee in company");
        }else{
            for(int i = 0; i< employees.length; i++){
                System.out.println(employees);
            }
        }
    }

    public void addGuest(Guest guest){
        if(guestCounter < GUEST_CAPACITY){
            guests[guestCounter] = guest;
            guestCounter ++;
        }else{
            System.out.println("Max guest capacity.");
        }
    }

    public void printGuests(){
        if(guestCounter == 0){
            System.out.println("No employee in company");
        }else{
            for(int i = 0; i< guests.length; i++){
                System.out.println(guests);
            }
        }
    }

}
