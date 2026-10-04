import java.io.*;

public class exp7_1 {
    public static void main(String[] args) {

        String source = "photo.jpg";
        String destination = "copy_photo.jpg";

        if (!(source.endsWith(".jpg") || source.endsWith(".png"))) {
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
            System.out.println("File Not Found Exception");
        }
    }
}