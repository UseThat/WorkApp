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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guest guest = (Guest) o;

        if (email != null ? !email.equals(guest.email) : guest.email != null) return false;
        return phone != null ? phone.equals(guest.phone) : guest.phone == null;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
