public class Administrator extends Person {
    private String role;

    public Administrator(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }
    // attribute

    public void managePerson(Person person) {
        System.out.println(getName() + " is managing " + person.getName());
    }
    //method

    @Override
    public String toString() {
        return super.toString() + ", Role: " + role;
    }
}