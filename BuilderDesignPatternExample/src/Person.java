import javax.swing.border.EmptyBorder;

public class Person {

    private int id;

    private String name;

    private String email;

    private int age;

    private int phone;

    public Person(PersonBuilder personBuilder) {
        this.id = personBuilder.id;
        this.name = personBuilder.name;
        this.email = personBuilder.email;
        this.age = personBuilder.age;
        this.phone = personBuilder.phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }
}
