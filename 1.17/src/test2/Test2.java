package test2;
class Shape{
    public void draw(){

    }
}

class Rect extends Shape{
    @Override
    public void draw(){
        System.out.println("棱形");
    }
}

class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("⭕");

    }
}

class Flower extends Shape{
    @Override
    public void draw(){
        System.out.println("❀");
    }
}

public class Test2 {
//    public static void drawMap(Shape shape){
//        shape.draw();
//    }
    public static void main(String[] args) {
        Rect rect = new Rect();
        Circle circle = new Circle();
        Flower flow = new Flower();

        Shape[] shapes = {new Rect(),new Flower(),new Circle(),new Circle(),new Rect()};
        for (Shape shape:shapes) {
            shape.draw();
        }
//        String[] shape = {"rect","circle","flow"};
//        for (String s:shape) {
//            if(s.equals("circle")){
//                circle.draw();
//            }else if(s.equals("rect")){
//                rect.draw();
//            }else if(s.equals("flow")){
//                flow.draw();
//            }
//
//        }
//        drawMap(rect);
//        drawMap(circle);
//        drawMap(flow);

    }
}
