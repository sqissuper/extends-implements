package practic;

import java.util.Arrays;
import java.util.Comparator;
//成绩比较
class ScoreComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.score - o2.score;
    }
}
//姓名比较
class NameComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}
//年龄比较
class AgeComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}
class Person {
    public String name;
    public int age;
    public int score;

    public Person(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

public class TestDemo1 {
    public static void main(String[] args) {

        Person[] per = new Person[3];
        per[0] = new Person("张三",15,54);
        per[1] = new Person("李四",14,100);
        per[2] = new Person("王兆",11,78);
        System.out.println(Arrays.toString(per));
        System.out.println("=================================");
        ScoreComparator sc1 = new ScoreComparator();
        Arrays.sort(per,sc1);
        System.out.println(Arrays.toString(per));
        System.out.println("==================================");
        NameComparator sc2 = new NameComparator();
        Arrays.sort(per,sc2);
        System.out.println(Arrays.toString(per));
        System.out.println("==================================");
        AgeComparator sc3 = new AgeComparator();
        Arrays.sort(per,sc3);
        System.out.println(Arrays.toString(per));

    }
}
