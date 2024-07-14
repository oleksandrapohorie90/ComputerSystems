package MarketPlace;

public abstract class Person {
    //base class for buyer and seller
    private String name;
    private String email;

    //default constructor
    public Person() {}

    //parameterized constructor
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void displayRole();
}
