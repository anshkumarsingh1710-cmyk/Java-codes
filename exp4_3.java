class Student {
    int id;
    String name;

    // Static variable
    static String collegeName = "Alliance University";

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("College Name: " + collegeName);
        System.out.println();
    }
}

public class exp4_3 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Priya");
        Student s3 = new Student(103, "Aman");

        s1.display();
        s2.display();
        s3.display();
    }
}