package remoteControl;

/**
 * Created by 平 on 2017/6/11.
 */
public class NoCommand implements Command {

    @Override
    public void execute(){
        System.out.println("NULL execute Command");
    }

    @Override
    public void undo(){
        System.out.println("NULL undo Command");
    }
}
