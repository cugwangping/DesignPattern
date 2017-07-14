import remoteControl.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("调用撤销功能的遥控器!");
        RemoteControl rc = new RemoteControl();
        Light light = new Light();  //创建灯对象
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        rc.setCommand(0,lightOn,lightOff);

        rc.onButtonWasPushed(0);
        rc.offButtonWasPushed(0);

        System.out.println(rc);

        rc.undoButtonWasPushed();   //撤销
        rc.offButtonWasPushed(0);
        rc.onButtonWasPushed(0);
        System.out.println(rc);
        rc.undoButtonWasPushed();   //撤销
    }
}
