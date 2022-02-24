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
        return super.toString() + " salary: "+getSalary()+" company mail: "+getCompanyMail()+" gender: "+getGender();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        if (companyMail != null ? !companyMail.equals(employee.companyMail) : employee.companyMail != null)
            return false;
        return gender != null ? gender.equals(employee.gender) : employee.gender == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (companyMail != null ? companyMail.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }
}
