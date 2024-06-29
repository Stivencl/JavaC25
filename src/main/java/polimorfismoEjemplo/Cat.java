package polimorfismoEjemplo;

public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("Cat es eating");
    }
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

}
