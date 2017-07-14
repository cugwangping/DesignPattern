import proxy.ProxyHandler;
import proxy.RealSubject;
import proxy.Subject;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        RealSubject rs = new RealSubject();     //创建委托对象
        ProxyHandler handler = new ProxyHandler(rs);    //创建调用处理器对象
        //动态生成代理对象
        Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
                RealSubject.class.getInterfaces(), handler);
        //通过代理调用方法
        proxySubject.request();
    }
}
