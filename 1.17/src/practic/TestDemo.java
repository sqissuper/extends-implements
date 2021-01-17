package practic;

import java.util.Arrays;
/*
对于comparable一般用在类的内部的
 */
class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int score;

    public Student(String name, int age, int score) {
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

    @Override
    public int compareTo(Student o) {
        if(this.score > o.score) return 1;
        else if(this.score == o.score) return 0;
        else return -1;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student[] stu = new Student[3];
        stu[0] = new Student("张三",15,54);
        stu[1] = new Student("李四",14,100);
        stu[2] = new Student("王兆",11,78);
        System.out.println(Arrays.toString(stu));
        System.out.println("=================================");
        Arrays.sort(stu);
        System.out.println(Arrays.toString(stu));
    }
}
