import java.io.IOException;
import java.sql.SQLDataException;

public class ThrowExample {

    public static void main(String[] args) {

        try {
            method1(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("continue");

    }

    public static void checkNumber(int number)  {

        if(number < 1){
            throw new NullPointerException(" Number should be greater than one ");
        }
    }

    public static void method1(int number) throws IOException {
        method2(number);
    }
    public static void method2(int number) throws IOException {method3(number);}
    public static void method3(int number) throws IOException {
        if(number < 1){
            throw new IOException(" Number should be greater than one ");
        }
    }

}
