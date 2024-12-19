package EncapsulationAbstraction;
import java.util.*;
public class numbers {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();

        num.add(21);
        num.add(22);

        for (Integer i: num){
            System.out.println(i);
        }
    }
}
