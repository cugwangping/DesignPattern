package subject;

import state.Position;

/**
 * Created by 平 on 2017/7/6.
 */
public class FootBall extends Ball {

    private Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
        //足球位置发生了改变，需要通知所有的观察者
        this.notifyObservers();
    }
}
