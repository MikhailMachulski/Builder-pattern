public class PersonBuilder implements PBuilder {

    public String name;
    public String surname;
    public int age;
    public String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public Person build() throws IllegalStateException, IllegalArgumentException {
        if (name == null || surname == null) throw new IllegalStateException("You have to enter name and surname");
        if (age < 0) throw new IllegalArgumentException("Age is incorrect");
        return new Person(name, surname, age, city);
    }


}
