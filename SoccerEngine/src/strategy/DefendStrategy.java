package strategy;

/**
 * Created by 平 on 2017/7/6.
 */
public class DefendStrategy implements TeamStrategy {

    @Override
    public void play() {
        System.out.println("Playing in defensive mode");
    }
}
