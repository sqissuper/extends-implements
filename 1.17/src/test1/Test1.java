package test1;
class Animal{
    public String name;
    public Animal(){
        System.out.println("animal");
    }
    public Animal(String name){
        this.name = name;
        System.out.println(this.name + "animal");
    }
    public Animal eat(){
        System.out.println("animal eat");
        return new Animal();
    }
}

class Dog extends Animal{
    public Dog(){
        System.out.println("dog");
    }
    public Dog(String name){
        super(name);
    }
    public Dog eat(){
        System.out.println("dog eat");
        return new Dog();
    }

}

public class Test1 {
    public static void main(String[] args) {
        Animal animal = new Animal("bit");
        Dog dog = new Dog("liujie");
//        Animal animal = new Dog();
//        animal.eat();
    }

}
