package builder;

/**
 * Created by 平 on 2017/7/6.
 */
//生成一场足球比赛
public interface Game {
    //一场比赛需要场地、球、比赛双方队伍、裁判员

    public void buildPlayGround();

    public void buildTeam();

    public void buildReferee();

    public void buildBall();

    public void startGame();

}
