package observer;

import state.Position;
import subject.FootBall;

/**
 * Created by 平 on 2017/7/6.
 */
//ConcreteObserverB
public class Referee implements IObserver {

    private Position ballPosition;  //足球的运动状态

    private FootBall ball; //足球

    private String name;    //足球比赛裁判员的名称

    public Referee(String name, FootBall ball) {
        this.name = name;
        this.ball = ball;
    }

    @Override
    public void update() {
        this.ballPosition = ball.getPosition();
        System.out.println("Referee " + name + " says that the ball is at " + ballPosition.toString());
    }
}
