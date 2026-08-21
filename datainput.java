import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class DataInputDemo {
    public static void main(String[] args) throws IOException {

        DataInputStream dis =
            new DataInputStream(new FileInputStream("data.txt"));

        int age = dis.readInt();
        double mark = dis.readDouble();
        boolean passed = dis.readBoolean();

        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);
        System.out.println("Passed: " + passed);

        dis.close();
    }
}