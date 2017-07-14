package remoteControl;


/**
 * Created by 平 on 2017/6/11.
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.on();
    }

    @Override
    public void undo(){
        System.out.println("撤销开灯操作");
        light.off();
    }
}
