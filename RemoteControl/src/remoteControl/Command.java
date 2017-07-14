package remoteControl;

/**
 * Created by 平 on 2017/6/11.
 */
public interface Command {
    public void execute();
    public void undo();
}
