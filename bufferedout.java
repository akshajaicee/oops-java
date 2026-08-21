import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferedOutputDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos =
            new FileOutputStream("output.txt");

        BufferedOutputStream bos =
            new BufferedOutputStream(fos);

        String text = "Hello Java";

        bos.write(text.getBytes());

        bos.close();

        System.out.println("Data written successfully.");
    }
}