package factorydesignpattern;

public class InternationalPlan extends Plan {
    @Override
    public int getRate() {
        return 8;
    }

    /*@Override
    public int getPrice(int unit) {
        return getRate() * unit;
    }*/
}
