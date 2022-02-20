package pl.workapp.model;

public class Guest extends Person {
    private String email;
    private String phone;

    public Guest (String firstName, String lastName, String email, String phone){
        super(firstName, lastName);
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return super.toString()+" email: "+email+" phone: "+phone;
    }
}
