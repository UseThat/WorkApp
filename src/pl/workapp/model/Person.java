package pl.workapp.model;

public class Person {
    private String firstName;
    private String lastName;
    private String privateMail;
    private String privatePhone;

    public Person(String firstName, String lastName, String privateMail, String privatePhone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.privateMail = privateMail;
        this.privatePhone = privatePhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPrivateMail() {
        return privateMail;
    }

    public void setPrivateMail(String privateMail) {
        this.privateMail = privateMail;
    }

    public String getPrivatePhone() {
        return privatePhone;
    }

    public void setPrivatePhone(String privatePhone) {
        this.privatePhone = privatePhone;
    }
}
