import java.io.FileInputStream;
import java.io.IOException;

class FileInputDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("input.txt");

        int data;

        while ((data = fis.read()) != -1) {
            System.out.print((char) data);
        }

        fis.close();
    }
}