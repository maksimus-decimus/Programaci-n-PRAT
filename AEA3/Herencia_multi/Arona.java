package Herencia_multi;

public class Arona extends SEAT{

    String color;

    public Arona()
    {
        System.out.println("SEAT Model: Arona");
    }

    @Override
    public void speed()
    {
        System.out.println("Max: 80Kmph");
    }

    public void setColor(String nColor) {
        color = nColor;
    }

    public String getColor(){
        return color;
    }
   


  
}
