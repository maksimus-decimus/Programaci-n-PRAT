package Herencias;

public class Cat extends Animal{

    public Cat(){
        int id = this.getId();
        this.setId(++id);
    }

    public Cat(int id){
        this.setId(id);
    }

    // Own behavior
    private void meow() {
        System.out.println("Cat '" + this.getId() + "' is meowing");
    }

    // Overriding super class behavior
    @Override
    public void sound() {
        meow();
    }
}