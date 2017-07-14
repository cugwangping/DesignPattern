package strategy;

/**
 * Created by 平 on 2017/7/6.
 */
public class AttackStrategy implements TeamStrategy {

    @Override
    public void play() {
        System.out.println("Playing in attacking mode");
    }
}
