package factorydesignpattern;

public class DomesticPlan extends Plan  {
    @Override
    public int getRate() {
        return 4;
    }

   /* @Override
    public int getPrice(int unit) {
        return getRate() * unit;
    }*/
}
