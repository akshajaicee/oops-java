import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataOutputDemo {
    public static void main(String[] args) throws IOException {

        DataOutputStream dos =
            new DataOutputStream(
                new FileOutputStream("data.txt")
            );

        dos.writeInt(20);
        dos.writeDouble(95.5);
        dos.writeBoolean(true);

        dos.close();

        System.out.println("Data written successfully.");
    }
}