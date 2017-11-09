import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Vector;

public class VectorExample {

    /*
     Vector :

       vector is same like array used to operate group of data.

       the difference is,
       vector is synchronized , Thread safe.
       vector having many legacy methods , that are not part of collections.

     */

    public static void main(String[] args){

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(3);
        vector.add(2);

        System.out.println("First Element = "+vector.firstElement());
        System.out.println("Last Element = "+vector.lastElement());


    }

}


