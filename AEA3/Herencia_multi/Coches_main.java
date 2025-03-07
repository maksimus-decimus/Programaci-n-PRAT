package Herencia_multi;

public class Coches_main {

    public static void main(String[] args) {
        Car c = new Car();
        c.vehicleType();
        System.out.println();


        Arona obj=new Arona();
        obj.vehicleType();
        obj.brand();
        obj.speed();
        obj.setColor("Blanc");
        System.out.println(obj.getColor());
    }
    
}
