package proxy;

/**
 * Created by 平 on 2017/6/4.
 */

/**
 *  委托类，需要代理的类
 */
public class RealSubject implements Subject{
    public void request(){
        System.out.println("真实被请求的对象......");
    }
}
