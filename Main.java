import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> university = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student("Rodrick", 15, "Mathematics", 3.5);
        Professor professor1 = new Professor("Dr. Hu", 60, "Professor of Math");
        Administrator admin1 = new Administrator("Mr. Eric", 50, "Registrar");
        Researcher researcher1 = new Researcher("Mrs. Huang", 38, "The relationship between physics and mathematics. ");

        university.add(student1);
        university.add(professor1);
        university.add(admin1);
        university.add(researcher1);
//university is an arraylist
        while (true) {
            System.out.println("Welcome to the University System!");
            System.out.println("Choose your role:");
            System.out.println("1. Student");
            System.out.println("2. Professor");
            System.out.println("3. Administrator");
            System.out.println("4. Researcher");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

             if (choice == 1){
                System.out.println(student1);
                    System.out.println("1. Study\n2. Ask Question to Professor");
                    int studentChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (studentChoice == 1) {
                        student1.study();
                    } else if (studentChoice == 2) {
                        student1.askQuestion(professor1);
                    }else {
                           System.out.println("Your choice is not valid, we gonna kick you out!!!");
                           break;
                           }
            } else if (choice == 2){
                System.out.println(professor1);
                    System.out.println("1. Teach a Student\n2. Add a Course");
                    int professorChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (professorChoice == 1) {
                        professor1.teach(student1);
                    } else if (professorChoice == 2) {
                        System.out.print("Enter course name: ");
                        String course = scanner.nextLine();
                        professor1.addCourse(course);
                    } else { 
                           System.out.println("Your choice is not valid, we gonna kick you out!!!");
                           break;
                           }
            } else if (choice == 3){
                System.out.println(admin1);
                    System.out.println("1. Manage a Person");
                    int adminChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (adminChoice == 1) {
                        admin1.managePerson(student1);
                    } else {
                           System.out.println("Your choice is not valid, we gonna kick you out!!!");
                           break;
                           }
            } else if (choice == 4){
                 System.out.println(researcher1);
                    System.out.println("1. Collaborate with Professor");
                    int researcherChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (researcherChoice == 1) {
                        researcher1.collaborate(professor1);
                    } else {
                           System.out.println("Your choice is not valid, we gonna kick you out!!!");
                           break;
                           }  
                    
            } else if (choice == 5) {
                System.out.println("Exiting the system. Goodbye!");
                break;
            } else {System.out.println("Your choice is not valid, we gonna kick you out!!!");
            break;
            }
        }

        scanner.close();
    }
}
