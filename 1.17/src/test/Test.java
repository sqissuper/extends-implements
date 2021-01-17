package test;
/*
抽象类
抽象类不能进行实例化
抽象类内可以拥有和普通类一样的属性和方法
抽象类可以发生向上转型，运行时绑定
当普通类继承了抽象类，这个普通类一定重写抽象类当中的抽象方法
抽象方法不能被private修饰
抽象类最大意义是为了被继承
 */
abstract class Shape {
    public int age;
    public String name;
    public abstract void draw();//抽象方法不能实现
}

abstract class Rect extends Shape {
//    @Override
//    public void draw() {
//        System.out.println("棱形");
//    }
}

class A extends Rect {
    @Override
    public void draw(){
        System.out.println("A");
    }
}
public class Test {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
//        Rect rect = new Rect();
//        drawMap(rect);
        drawMap(new A());
    }
}
