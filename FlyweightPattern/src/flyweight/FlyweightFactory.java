package flyweight;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by 平 on 2017/6/4.
 */
public class FlyweightFactory {

    static Map<String, Shape> shapes = new HashMap<String, Shape>();

    public static Shape getShape(String key){
        Shape shape = shapes.get(key);
        if(shape == null){
            shape = new Circle(key);
            shapes.put(key,shape);
        }
        return shape;
    }

    public static int getSum(){
        return shapes.size();
    }
}
