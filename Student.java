public class Student extends Person {
    private String major;
    private double gpa;

    public Student(String name, int age, String major, double gpa) {
        super(name, age);
        this.major = major;
        this.gpa = gpa;
    }

    public void study() {
        System.out.println(getName() + " is studying.");
    }

    public void askQuestion(Professor professor) {
        System.out.println(getName() + " asks a question to Professor " + professor.getName());
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major + ", GPA: " + gpa;
    }
}
