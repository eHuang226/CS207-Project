package entity;


public class Participant extends User {

    public Participant(String name, String password, String email) {
        super(name, password, email);
    }
    public String getName() {
        return this.name;

    }

    @Override
    public String getPassword() {
        return "";
    }

}
