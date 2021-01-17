package understand;
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}
interface ISwimming {
    void swim();
}
interface IRunning {
    void run();
}
interface IFlying {
    void fly();
}

class Cat extends Animal implements IRunning {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "跑");
    }
}

class Fish extends Animal implements ISwimming {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name + "游泳");
    }
}

class Swan extends Animal implements ISwimming,IRunning,IFlying {

    public Swan(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name + "游泳");
    }
    @Override
    public void run() {
        System.out.println(this.name + "跑");
    }
    @Override
    public void fly() {
        System.out.println(this.name + "飞");
    }
}
public class Test4 {
    public static void goFly(IFlying ifly){
        ifly.fly();
    }
    public static void goSwim(ISwimming iswim){
        iswim.swim();
    }
    public static void goRun(IRunning irun){
        irun.run();
    }

    public static void main(String[] args) {
        goFly(new Swan("天鹅"));
        goRun(new Swan("天鹅"));
        goSwim(new Swan("天鹅"));
//        IFlying ifly = new Swan("天鹅");
//        ifly.fly();
//        IRunning irun = new Swan("天鹅");
//        irun.run();
//        ISwimming iswim = new Swan("天鹅");
//        iswim.swim();
//        Cat cat = new Cat("猫");
//        cat.run();
    }
}
