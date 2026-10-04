import java.io.*;

public class exp7_3 extends Thread {

    String fileName;

    exp7_3(String fileName) {
        this.fileName = fileName;
    }

    public void run() {

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File Not Found Exception");
            return;
        }

        if (file.length() <= 0) {
            System.out.println("Invalid File Size");
            return;
        }

        System.out.println("Uploading " + fileName + "...");

        System.out.println("File Uploaded Successfully");
    }

    public static void main(String[] args) {

        exp7_3 upload = new exp7_3("employee.jpg");

        upload.start();
    }
}