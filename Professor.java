import java.util.ArrayList;

public class Professor extends Person {
    private String department;
    private ArrayList<String> courses;

    public Professor(String name, int age, String department) {
        super(name, age);
        this.department = department;
        this.courses = new ArrayList<>();
    }

    public void teach(Student student) {
        System.out.println(getName() + " is teaching " + student.getName());
    }

    public void addCourse(String course) {
        courses.add(course);
        System.out.println("Course " + course + " added to Professor " + getName());
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Courses: " + courses;
    }
}
