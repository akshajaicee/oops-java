import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos =
            new FileOutputStream("output.txt");

        String text = "Hello Java";

        fos.write(text.getBytes());

        fos.close();

        System.out.println("Data written successfully.");
    }
}