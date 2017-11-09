public class ErrorExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalized");
    }

    public static void main(String[] args) {

        try {
             System.exit(1);
        } catch (Exception e){
            System.out.println("Catch");
        }

        finally {
            System.out.println("finally");
        }



        System.out.println("continue");


    }
}



