package Herencia_multi;

public class Arona extends SEAT{

    public Arona()
    {
        System.out.println("SEAT Model: Arona");
    }

    @Override
    public void speed()
    {
        System.out.println("Max: 80Kmph");
    }


    public static void main(String args[])
    {
        Arona obj=new Arona();
        obj.vehicleType();
        obj.brand();
        obj.speed();
    }
}
