package decorator;

import observer.Player;

/**
 * Created by 平 on 2017/7/6.
 */
public class Defender extends PlayerRole {

    public void defend(){
        System.out.println("Defender " + super.getPlayer().getName() + " : defend the ball");
    }

    @Override
    public void task() {
        defend();
    }
}
