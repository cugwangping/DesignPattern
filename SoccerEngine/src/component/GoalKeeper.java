package component;

import observer.Player;
import subject.FootBall;

/**
 * Created by 平 on 2017/7/6.
 */
public class GoalKeeper extends Player {

    public GoalKeeper(String playerName, FootBall ball) {
        super(playerName, ball);
    }

    @Override
    public void passBall() {
        System.out.println("Goal keeper " + this.getName() + " : passed the ball");
    }
}
