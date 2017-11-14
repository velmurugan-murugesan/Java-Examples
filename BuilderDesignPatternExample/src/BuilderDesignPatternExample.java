public class BuilderDesignPatternExample {

    public static void main(String[] args) {

        Person person1 = new PersonBuilder(1,"velm").setEmail("velmurugan@gmail.com").setAge(23).setPhone(0456723).Build();
        System.out.println(person1.toString());

        Person person2 = new PersonBuilder(2,"Raja").setAge(24).Build();
        System.out.println(person2);

        Person person3 = new PersonBuilder(3,"mani").Build();
        System.out.println(person3);
    }
}
