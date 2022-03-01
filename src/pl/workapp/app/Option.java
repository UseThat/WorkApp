package pl.workapp.app;

public enum Option {
    EXIT(0,"exit"),
    ADD_EMPLOYEE(1,"add employee"),
    ADD_GUEST(2,"add guest"),
    PRINT_EMPLOYEE(3, "print employees"),
    PRINT_GUEST(4,"print guests");

    private int value;
    private String description;

    Option(int value, String description){
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return  value +" - " + description ;
    }

    static Option createFromInt(int option){
        return Option.values()[option];
    }
}
