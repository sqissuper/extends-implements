package practic;

import com.sun.xml.internal.bind.v2.runtime.output.FastInfosetStreamWriterOutput;

class Money implements Cloneable{
    public double mon = 1.17;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person1 implements Cloneable {
    public String name;
    public Money m = new Money();
//    public int age;
//    public int score;

    public Person1(String name) {
        this.name = name;
//        this.age = age;
//        this.score = score;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person1 per = (Person1) super.clone();
        per.m = (Money)this.m.clone();
        return per;
    }
}
public class TestDemo3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person1 per = new Person1("比特");
        Person1 per4 = (Person1)per.clone();
        per.name = "张三";
        System.out.println(per.name);
        System.out.println(per4.name);
        System.out.println("==================================");
        per4.m.mon = 10;
        System.out.println(per.m.mon);
        System.out.println(per4.m.mon);
    }
}
