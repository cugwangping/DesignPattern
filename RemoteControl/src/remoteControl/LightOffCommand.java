package remoteControl;

/**
 * Created by 平 on 2017/6/11.
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.off();
    }

    @Override
    public void undo() {
        System.out.println("撤销关灯操作");
        light.on();
    }

}
