import java.util.ArrayList;

public class CollectionInterfaceExample {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        //Basic collection codes

        // adding elements
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        System.out.println("****Basic ArrayList*****");
        arrayList.forEach(System.out::println);

        // removing elements
        System.out.println("****Remove Five*****");
        arrayList.remove("five");

        //addAll
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("six");

        System.out.println("****Add Six AddAll*****");
        arrayList.addAll(arrayList1);

        //removeAll
        System.out.println("****Remove Six RemoveAll*****");
        arrayList.removeAll(arrayList1);
        arrayList.forEach(System.out::println);


        //size
        System.out.println("*****Print List Size*****");
        System.out.println(arrayList.size());

        //contains
        System.out.println("*****contains one****");
        boolean contains = arrayList.contains("one");
        System.out.println(contains);

        //containsAll
        System.out.println("*****contains All****");
        boolean cotainsAll = arrayList.containsAll(arrayList);
        System.out.println(cotainsAll);

        //Is Empty
        System.out.println("*****Is Empty****");
        boolean isEmpty = arrayList.isEmpty();
        System.out.println(isEmpty);

        //Equals
        System.out.println("*****Check Equal*******");
        Boolean checkEqual = arrayList.equals(arrayList1);
        System.out.println(checkEqual);


        /*//to Array
        System.out.println("*****To Array****");
        String[] strings = (String[]) arrayList.toArray();
        System.out.println(strings);*/

        //retainAll //return the common item in both list
        System.out.println("****RetainAll *****");
        arrayList1.add("four");
        arrayList.retainAll(arrayList1);
        arrayList.forEach(System.out::println);



    }
}
