package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by 平 on 2017/6/4.
 */

/**
 *  代理类的调用处理器
 */
public class ProxyHandler implements InvocationHandler {
    private Subject subject;

    public ProxyHandler(Subject subject){
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args){
        System.out.println("调用预处理器进行预处理操作前......");
        Object result = null;
        try {
            result = method.invoke(subject, args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("调用预处理器进行预处理操作后......");
        return result;
    }
}
