public class PersonBuilder {

    public int id;
    public String name;
    public String email;
    public int age;
    public int phone;

    public PersonBuilder(int id, String name){
        this.id = id;
        this.name = name;
    }

    public PersonBuilder setEmail(String email){
        this.email = email;
        return this;
    }

    public PersonBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public PersonBuilder setPhone(int phone){
        this.phone = phone;
        return this;
    }

    public Person Build(){
        return new Person(this);
    }

}
