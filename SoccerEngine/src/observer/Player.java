package observer;

import state.Position;
import subject.FootBall;

/**
 * Created by 平 on 2017/7/6.
 */
//ConcreteObserverA
public abstract class Player implements IObserver {

    private Position ballPosition;      //足球的运动状态

    private FootBall ball;      //足球

    private String name;    //足球运动员的名称

    public Player(String name, FootBall ball) {
        this.name = name;
        this.ball = ball;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update() {
        this.ballPosition = ball.getPosition();
        System.out.println("Player " + name + " says that the ball is at " + ballPosition.toString());
    }

    // player's responsibility 传球
    abstract public void passBall();
}
