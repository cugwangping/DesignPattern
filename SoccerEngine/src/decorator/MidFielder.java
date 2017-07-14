package decorator;

import observer.Player;

/**
 * Created by 平 on 2017/7/6.
 */
public class MidFielder extends PlayerRole {

    public void dribble(){
        System.out.println("Middle fielder " + super.getPlayer().getName() + " : dribbled the ball");
    }

    @Override
    public void task() {
        dribble();
    }
}
