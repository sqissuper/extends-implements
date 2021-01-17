package test3;
/*
一个类可以实现多个接口
普通类既可以继承抽象类也可以实现多个接口
一个普通类只能继承一个一个父类
接口就为了多继承
 */
interface A {
    void funA();
}
interface B {
    void funB();
}
interface C {
    void funC();
}
//此时extends意为拓展
interface D extends A,B,C {
    void funD();
}
class F implements D {

    @Override
    public void funA() {

    }
    @Override
    public void funB() {

    }
    @Override
    public void funC() {

    }
    @Override
    public void funD() {

    }
}
abstract class TestAbstract {
    public abstract void funAbstract();
}

class Test extends TestAbstract implements A,B,C {

    @Override
    public void funA() {

    }
    @Override
    public void funB() {

    }
    @Override
    public void funC() {

    }

    @Override
    public void funAbstract() {

    }
}
public class Demo3 {
}
