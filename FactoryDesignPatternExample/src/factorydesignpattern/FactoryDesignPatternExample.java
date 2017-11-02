package factorydesignpattern;

public class FactoryDesignPatternExample {

    public static void main(String[] args) {

        Plan plan = new PlanFactory().getPlan("Domestic");

        System.out.println("Rate = "+plan.getRate());

        System.out.println("Price = "+plan.getPrice(4));


    }
}
