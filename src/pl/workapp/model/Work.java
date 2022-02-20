package pl.workapp.model;

public class Work {
    private static final int PERSON_CAPACITY = 100;
    private Person [] persons = new Person[PERSON_CAPACITY];
    private int personCounter;

    public void addEmployee(Employee employee){
        if(personCounter < PERSON_CAPACITY){
            persons[personCounter] = employee;
            personCounter ++;
        }else{
            System.out.println("Max employee capacity.");
        }
    }

    public void printEmployees(){
        int employeeCounter = 0;
        for(int i = 0 ; i < personCounter ; i++){
            if(persons[i] instanceof Employee) {
                System.out.println(persons[i]);
                employeeCounter ++;
            }
        }
        if(employeeCounter == 0){
            System.out.println("No employee in company");
        }
    }

    public void addGuest(Guest guest){
        if(personCounter < PERSON_CAPACITY){
            persons[personCounter] = guest;
            personCounter ++;
        }else{
            System.out.println("Max guest capacity.");
        }
    }

    public void printGuests(){
        int guestCounter = 0;
        for(int i = 0 ; i < personCounter ; i++){
            if(persons[i] instanceof Guest) {
                System.out.println(persons[i]);
                guestCounter ++;
            }
        }
        if(guestCounter == 0){
            System.out.println("No employee in company");
        }
    }

}
