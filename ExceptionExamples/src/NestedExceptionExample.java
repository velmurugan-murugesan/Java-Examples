public class NestedExceptionExample {

    public static void main(String[] args) {

        String nullName = null;
        try{
            System.out.println("Inside try");
            try {
                int i = 30 / 0;
            } catch (ArithmeticException e){
                try{
                    System.out.println(nullName.length());
                } catch (NullPointerException n){
                    System.out.println("Catch inside catch");
                }
                System.out.println("ArithmeticException");
            }
            finally {
                System.out.println("finally executed");
            }
            try {
                String name = "velm";
                int length = name.length();
                System.out.println("length = "+length);
                //System.exit(1);
            } catch (Exception e){
                System.out.println("NullPointerException");
            }
            finally {
                System.out.println("finally executed");
            }
        }catch (Exception e){
            System.out.println("General Exception");
        }

        finally {
            System.out.println("finally executed");
            try {
                System.out.println(nullName.length());
            }
            catch (Exception e){
                System.out.println("exception inside final");
            }
        }
        System.out.println("continue");
    }
}
