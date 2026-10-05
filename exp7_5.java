import java.io.*;

class ImageCopy extends Thread {

    String source;
    String destination;

    ImageCopy(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    public void run() {

        try {
            File file = new File(source);

            if (!file.exists()) {
                System.out.println("Image File Not Found Exception");
                return;
            }

            if (file.length() <= 0) {
                System.out.println("Invalid Image File Size");
                return;
            }

            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();

            System.out.println("Image File Copied Successfully");

        } catch (IOException e) {
            System.out.println("Image File Error");
        }
    }
}


class TextCopy implements Runnable {

    String source;
    String destination;

    TextCopy(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    public void run() {

        try {
            File file = new File(source);

            if (!file.exists()) {
                System.out.println("Text File Not Found Exception");
                return;
            }

            if (file.length() <= 0) {
                System.out.println("Invalid Text File Size");
                return;
            }

            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(destination);

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("Text File Copied Successfully");

        } catch (IOException e) {
            System.out.println("Text File Error");
        }
    }
}


public class exp7_5 {

    public static void main(String[] args) {

        ImageCopy image = new ImageCopy(
            "employee.jpg",
            "backup_employee.jpg"
        );

        TextCopy text = new TextCopy(
            "report.txt",
            "backup_report.txt"
        );

        Thread imageThread = image;

        Thread textThread = new Thread(text);

        imageThread.start();
        textThread.start();
    }
}