package hospital;

public class Patient {

    private int patientId;
    private String patientName;
    private int age;
    private String diagnosis;

    private static String hospitalName = "Apollo Hospital";

    public static final int MAX_PATIENTS = 100;

    // Constructor
    public Patient(int patientId, String patientName, int age, String diagnosis) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Getter for Patient ID
    public int getPatientId() {
        return patientId;
    }

    // Getter for Patient Name
    public String getPatientName() {
        return patientName;
    }

    // Getter for Age
    public int getAge() {
        return age;
    }

    // Getter for Diagnosis
    public String getDiagnosis() {
        return diagnosis;
    }

    // Getter for Hospital Name
    public String getHospitalName() {
        return hospitalName;
    }

    // Setter for Patient Name
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    // Setter for Age
    public void setAge(int age) {
        this.age = age;
    }

    // Setter for Diagnosis
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Display patient details
    public void displayDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Hospital Name: " + hospitalName);
    }
}