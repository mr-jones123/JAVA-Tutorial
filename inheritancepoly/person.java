package inheritancepoly;

public class person {
    private String name;
    private int age;

    public person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(String name){
        return name;
    }

    public int getAge(int age){
        return age;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
