public class Researcher extends Person {
    private String researchTopic;

    public Researcher(String name, int age, String researchTopic) {
        super(name, age);
        this.researchTopic = researchTopic;
    }

    public void collaborate(Professor professor) {
        System.out.println(getName() + " is collaborating with Professor " + professor.getName());
    }

    @Override
    public String toString() {
        return super.toString() + ", Research Topic: " + researchTopic;
    }
}
