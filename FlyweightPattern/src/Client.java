import flyweight.FlyweightFactory;
import flyweight.Shape;

public class Client {

    public static void main(String[] args) {
        //绘制红圆
        Shape shape1 = FlyweightFactory.getShape("红色");
        shape1.draw();

        //绘制橙圆
        Shape shape2 = FlyweightFactory.getShape("橙色");
        shape2.draw();

        //绘制黄圆
        Shape shape3 = FlyweightFactory.getShape("黄色");
        shape3.draw();

        //统计绘制了多少圆
        System.out.println("统计：一共绘制了" + FlyweightFactory.getSum()+"种颜色的圆形");
    }
}
