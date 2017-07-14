package director;

import builder.BasketballGame;
import builder.Game;
import builder.SoccerGame;

public class GameEngine {

    private Game game;

    public GameEngine(Game game){
        this.game = game;
    }

    public void construct(){
        System.out.println("GameEngine 指挥 Game 构造一场比赛");
        //生成比赛场地
        game.buildPlayGround();
        //生成比赛的球类
        game.buildBall();
        //生成比赛队伍
        game.buildTeam();
        //生成比赛裁判
        game.buildReferee();
        //开始比赛
        game.startGame();

    }

    public static void main(String[] args) {
        System.out.println("Simulate Soccer Engine !");
        System.out.println("address problem with strategy, observer, decorator and build pattern");

        //用生成器去生成一场篮球比赛
        Game basketballGame = new BasketballGame();
        GameEngine gameEngineBasket = new GameEngine(basketballGame);
        gameEngineBasket.construct();

        System.out.println("休息时间...");

        //用生成器去生成一场足球比赛
        Game soccerGame = new SoccerGame();
        GameEngine gameEngineSoccer = new GameEngine(soccerGame);
        gameEngineSoccer.construct();

    }
}
