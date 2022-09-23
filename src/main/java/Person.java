public class Person {
    private String name, surname;
    private String type;


    public Person(){

    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Person setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getType() {
        return type;
    }

    public Person setType(String type) {
        this.type = type;
        return this;
    }

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.type = "Person";

    }
}
