import request.*;
import handler.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("职责链模式");

        // 创建指责链的所有节点
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler3 = new Handler3();

        // 进行链的组装，即头尾相连，一层套一层
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        // 创建请求并提交到指责链中进行处理
        AbstractRequest request1 = new Request1("请求-01");
        AbstractRequest request2 = new Request2("请求-02");
        AbstractRequest request3 = new Request3("请求-03");

        // 每次提交都是从链头开始遍历
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }
}
