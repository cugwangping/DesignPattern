package decorator;

import observer.Player;

/**
 * Created by 平 on 2017/7/6.
 */
public abstract class PlayerRole {

    private Player player;

    public void passBall() {
        player.passBall();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public abstract void task();
}
