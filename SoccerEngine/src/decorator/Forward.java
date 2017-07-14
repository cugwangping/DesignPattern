package decorator;

import observer.Player;

/**
 * Created by 平 on 2017/7/6.
 */
public class Forward extends PlayerRole {

    public void shootGoal(){
        System.out.println("Forward "+ super.getPlayer().getName()+ " : shooted the ball to goalpost");
    }

    @Override
    public void task() {
        shootGoal();
    }
}
