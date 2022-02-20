package pl.workapp.model;

public class Employee extends Person{
    private  double salary;
    private String companyMail;
    private String gender;

    public Employee(String firstName, String lastName, double salary, String companyMail, String gender){
        super(firstName, lastName);
        this.salary = salary;
        this.companyMail = companyMail;
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyMail() {
        return companyMail;
    }

    public void setCompanyMail(String companyMail) {
        this.companyMail = companyMail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getFirstName() +" "+getLastName()+ " salary: "+getSalary()+" company mail: "+getCompanyMail()+" gender: "+getGender();
    }
}
