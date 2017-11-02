package factorydesignpattern;

abstract class Plan {

        abstract int getRate();
        public int getPrice(int unit){
            return getRate()*unit;
        }

}
