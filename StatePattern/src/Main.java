import state.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("状态模式!");

        //创建环境
        Context context = new Context();

        //创建状态A
        State stateA = new ConcreteStateA();

        //将状态设置到环境中
        context.setState(stateA);
        //请求
        context.request("testA");


        //创建状态B
        State stateB = new ConcreteStateB();

        //将状态设置到环境中
        context.setState(stateB);
        //请求
        context.request("testB");

    }
}
