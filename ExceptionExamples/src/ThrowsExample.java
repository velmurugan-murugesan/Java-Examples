import java.io.IOException;

public class ThrowsExample {

    public static void main(String[] args) {

        try {
            getId();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("continue");

    }

    public static void getId() throws IOException {

        throw  new IOException("No Id");
    }
}
