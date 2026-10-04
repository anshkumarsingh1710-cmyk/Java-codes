import java.io.*;

public class exp7_2 {
    public static void main(String[] args) {

        String source = "report.txt";
        String destination = "copy_report.txt";

        if (!source.endsWith(".txt")) {
            System.out.println("Unsupported File Type");
            return;
        }

        File file = new File(source);

        if (!file.exists()) {
            System.out.println("File Not Found Exception");
            return;
        }

        if (file.length() <= 0) {
            System.out.println("Invalid File Size");
            return;
        }

        try {
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
            System.out.println("File Not Found Exception");
        }
    }
}