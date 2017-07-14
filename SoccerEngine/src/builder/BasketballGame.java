package builder;

/**
 * Created by 平 on 2017/7/6.
 */
public class BasketballGame implements Game {
    //一场足球比赛需要一个篮球场、一个篮球、两个篮球队、一个裁判员

    @Override
    public void buildPlayGround() {
        System.out.println("创建一个篮球场");
    }

    @Override
    public void buildBall() {
        System.out.println("创建一个篮球");
    }

    @Override
    public void buildTeam() {
        System.out.println("创建两个篮球队");
    }

    @Override
    public void buildReferee() {
        System.out.println("创建一个裁判员");
    }

    @Override
    public void startGame() {
        System.out.println("开始篮球比赛");
    }

}
