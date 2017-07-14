package flyweight;


/**
 * Created by 平 on 2017/6/4.
 */
public class Circle extends Shape{
    private String colour;

    public Circle(String colour){
        this.colour = colour;
    }

    public void draw(){
        System.out.println("画了一个" + colour + "的圆");
    }

}
