import java.io.*;

public class exp7_4 implements Runnable {

    String fileName;

    exp7_4(String fileName) {
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

        System.out.println("Backing up " + fileName + "...");

        System.out.println("Backup Completed Successfully");
    }

    public static void main(String[] args) {

        exp7_4 backup = new exp7_4("employee.jpg");

        Thread t = new Thread(backup);

        t.start();
    }
}