package test3;
/*
接口关键字 interface
接口当中的方法不能被具体的实现
接口当中的方法默认是：public abstract
default修饰的方法是默认的方法，可以被具体的实现
接口不能进行实例化
类和接口的关系是implement
接口可以实现多态
 */
interface IShape {
    public static final int age = 10;//定义的同时进行初始化
    void draw();

//    default void func() {
//        System.out.println("aaa");
//    }
}

class Rect implements IShape{
    @Override
    public void draw() {
        System.out.println("棱形");
    }
}
class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("⭕");
    }
}
public class Test3 {
    public static void drawMap(IShape ishape) {
        ishape.draw();
    }
    public static void main(String[] args) {
        drawMap(new Circle());
    }
}
