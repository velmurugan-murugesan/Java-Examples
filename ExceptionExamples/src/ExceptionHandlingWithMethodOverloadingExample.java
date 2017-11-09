import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandlingWithMethodOverloadingExample extends PersonData {

    public static void main(String[] args) throws FileNotFoundException {

        ExceptionHandlingWithMethodOverloadingExample e = new ExceptionHandlingWithMethodOverloadingExample();
        //e.name();
    }

    /*@Override
    public void name() throws NullPointerException{
        super.name();
    }*/

    @Override
    public void name() throws FileNotFoundException{
       //
        System.out.println("name");
    }
}

class PersonData{

   /* public void name()  {
        System.out.println("Name");
    }*/


   public void name() throws IOException {

       System.out.println("name");
   }

}
