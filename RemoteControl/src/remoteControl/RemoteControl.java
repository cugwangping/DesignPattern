package remoteControl;

/**
 * Created by 平 on 2017/6/11.
 */
//Invoker
public class RemoteControl {
    Command[] onCommands;   //开灯命令
    Command[] offCommands;  //关灯命令
    Command undoCommand;    //撤销命令

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();

        for(int i=0; i<7; i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

}
