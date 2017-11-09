import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Executors;

public class ExceptionExample {

   /*
       There are two types of exception in java.
       1.checked exception
       2.unchecked exception
       3. Error

       1. checked exception:
          The class that extends throwable class except Runtime exception called checked exception.
          checked exception are checked at compile-time exception.
          Ex : SQLException , IOException , FileNotFoundException  etc.

          SQLException extends Exception, Exception extends Throwable


      2. unchecked exception:
         The class that extends throwable class called unchecked exception.
         uncheck exceptions are check at run-time.
         Ex : NullPointerException , ArithmeticException, etc.

         NullPointerException extends RuntimeException , RuntimeException extends Exception , Exception extends Throwable

      3. Error:
         Error are Irrecoverable . Ex VirtualMachine Error , OutOfMemory Error , etc.

     */

    public static void main(String[] args)  {


        /*
        Checked Exception
         */
        //FileNotFoundException
        try {
            FileReader fileReader = new FileReader("C:/velm");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        }
        catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
        }
        catch (Exception e){
            System.out.println("General Exception");
        }

    /*
    Unchecked Exception
     */
        // NullPointerException
       /* String name = null;

        int length = name.length();

        System.out.println(length);*/

        // ArithmeticException
        /*int val = 5/0;
        System.out.println(val);*/

        //ArrayIndexOutOfBoundsException
        try {
            int[] a = new int[5];
            System.out.println(a[10]);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException ");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException ");
        }
        System.out.println("Continue");


    }
}
