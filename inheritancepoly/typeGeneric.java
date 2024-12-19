package inheritancepoly;
import java.util.*;
public class typeGeneric {
    public static void main(String[] args) {
        List<person> listOfPerson = new ArrayList<>();

        person Person1 = new person("Xynil", 20);
        person Person2 = new person("Hershey", 19);

        listOfPerson.add(Person1);
        listOfPerson.add(Person2);

        for (person Person : listOfPerson){
            System.out.println(Person);
        }
    }
}
