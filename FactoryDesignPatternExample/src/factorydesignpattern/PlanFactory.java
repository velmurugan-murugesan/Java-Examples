package factorydesignpattern;

public class PlanFactory {

    public Plan getPlan(String planName){


        if(planName.equals("Domestic")){

            return new DomesticPlan();
        } else {
            return new InternationalPlan();
        }

    }

}
