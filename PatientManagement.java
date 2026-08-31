package hospital;
import java.util.Scanner;

public class PatientManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Diagnosis: ");
        String diagnosis = sc.nextLine();

        // Validate age
        if (age < 1 || age > 100) {
            System.out.println("Invalid Age");
            sc.close();
            return;
        }

        // Create Patient object
        Patient patient = new Patient(id, name, age, diagnosis);

        System.out.println("Patient Record Created");

        // Update diagnosis
        System.out.print("\nEnter new diagnosis to update: ");
        String newDiagnosis = sc.nextLine();

        patient.setDiagnosis(newDiagnosis);

        System.out.println("Patient Record Updated");

        // Search patient
        System.out.print("\nEnter Patient ID to Display: ");
        int searchId = sc.nextInt();

        if (patient.getPatientId() == searchId) {

            System.out.println("Patient Details Displayed");
            patient.displayDetails();

        } else {

            System.out.println("Patient Not Found");
        }

        sc.close();
    }
}