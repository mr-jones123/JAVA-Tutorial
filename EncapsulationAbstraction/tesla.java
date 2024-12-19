package EncapsulationAbstraction;
class tesla implements car{
    public void drive(){
        System.out.println("Tesla is a self-driving car");
    }

    public static void main(String[] args) {
        tesla SEXY = new tesla();

        SEXY.drive();
    }
}