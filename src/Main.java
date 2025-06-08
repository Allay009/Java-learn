import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static class Student {
        String name;
        int age;
        float grade;

        public Student(String name, int age, float grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public String toString() {
            return "StudentName: " + name + ", AGE: " + age + ", Grade: " + grade;
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Welcome to the Student Query Script");
         
        while (true) {

            System.out.println("Press 1 to start registration, \npress 2 to check student information, \npress 3 to close the program.");

                int number = scanner.nextInt();
                scanner.nextLine(); 

            switch (number) {
            case 1:
                System.out.println("Go to the sign-up script");

                System.out.println("Please enter a name:");
                String name = scanner.nextLine();

                System.out.println("Please enter your age:");
                int age = scanner.nextInt();

                System.out.println("Please enter your grades:");
                float grade = scanner.nextFloat();

                students.add(new Student(name, age, grade));
                System.out.println("Registration was successful!");
                
                break;

            case 2:
                System.out.println("\nAccess to check student information\n");
                if (students.isEmpty()) {
                    System.out.println("\nThere is no current student information.\n");
                } else {
                    for (Student member : students) {
                        System.out.println(member);
                    }
                }

                break;

            case 3:
                System.out.println("\nbye!!");
                scanner.close();

                return;

            default:
                System.out.println("Invalid input \npress 1 to start registration, \npress 2 to check student information, \npress 3 to close the program.");
                break;
            }
        }
    }
}
