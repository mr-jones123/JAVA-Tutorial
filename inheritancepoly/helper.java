package inheritancepoly;

public class helper {
    
    static int add(int x, int y){
        return x + y;
    }

    static int add(int x, int y, int z){
        return x + y + z;   
    }
    public static void main(String[] args) {
        System.out.println(helper.add(69, 69));
        System.out.println(helper.add(420, 69, 420));
    }
}