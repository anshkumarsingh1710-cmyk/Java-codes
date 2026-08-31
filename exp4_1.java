import java.util.Scanner;

class Student {
    int studentId;
    String name;
    double cgpa;

    // Constructor
    Student(int studentId, String name, double cgpa) {
        this.studentId = studentId;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

public class exp4_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        Student s = new Student(id, name, cgpa);

        s.display();

        sc.close();
    }
}