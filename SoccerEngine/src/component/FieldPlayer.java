package component;

        import observer.Player;
        import subject.FootBall;

/**
 * Created by 平 on 2017/7/6.
 */
public class FieldPlayer extends Player {

    public FieldPlayer(String playerName, FootBall ball) {
        super(playerName,ball);
    }

    @Override
    public void passBall() {
        System.out.println("Field player " + this.getName() + " : passed the ball");
    }
}
