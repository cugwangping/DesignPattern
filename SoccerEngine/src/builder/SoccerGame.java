package builder;

import component.FieldPlayer;
import component.GoalKeeper;
import context.Team;
import decorator.Defender;
import decorator.Forward;
import decorator.MidFielder;
import decorator.PlayerRole;
import observer.Player;
import observer.Referee;
import state.Position;
import strategy.AttackStrategy;
import strategy.DefendStrategy;
import strategy.TeamStrategy;
import subject.FootBall;

import java.util.List;

/**
 * Created by 平 on 2017/7/6.
 */
public class SoccerGame implements Game {
    //一场足球比赛需要一个足球场、一个足球、两个足球队、三个裁判员

    private FootBall ball;
    private Player[] player1;
    private Player[] player2;
    private Team team1;
    private Team team2;
    private Referee referee1;
    private Referee referee2;
    private Referee referee3;

    @Override
    public void buildPlayGround() {
        System.out.println("创建一个足球场");
    }

    @Override
    public void buildBall() {
        System.out.println("创建一个足球");
        ball = new FootBall();
    }

    @Override
    public void buildTeam() {
        System.out.println("创建两个足球队");
        team1 = new Team("必胜队");
        //为足球队添加球员
        String playerName;
        player1 = new Player[11];
        playerName = "必胜1号球员";
        player1[0] = new GoalKeeper(playerName,ball);
        for(int i=1; i<11; i++){
            playerName = "必胜" + Integer.toString(i+1) + "号球员";
            player1[i] = new FieldPlayer(playerName,ball);
        }
        team2 = new Team("无敌队");
        player2 = new Player[11];
        playerName = "无敌1号球员";
        player2[0] = new GoalKeeper(playerName,ball);
        for(int i=1; i<11; i++){
            playerName = "无敌" + Integer.toString(i+1) + "号球员";
            player2[i] = new FieldPlayer(playerName,ball);
        }
    }

    @Override
    public void buildReferee() {
        System.out.println("创建三个裁判");
        referee1 = new Referee("Mike",ball);
        referee2 = new Referee("John",ball);
        referee3 = new Referee("Owen",ball);
    }

    @Override
    public void startGame() {
        //开始足球比赛
        System.out.println("开始足球比赛");
        //观察者模式，为足球添加观察者
        ball.attachObserver(referee1);
        ball.attachObserver(referee2);
        ball.attachObserver(referee3);
        for (int i = 0; i<11;i++){
            ball.attachObserver(player1[i]);
            ball.attachObserver(player2[i]);
        }
        System.out.println("After attaching the observers...");
        ball.setPosition(new Position(0,0,0));

        //策略模式，为足球队添加策略
        TeamStrategy attackStrategy = new AttackStrategy();
        //球队1攻击
        team1.setTeamStrategy(attackStrategy);
        team1.playGame();
        TeamStrategy defendStrategy = new DefendStrategy();
        //球队2防守
        team2.setTeamStrategy(defendStrategy);
        team2.playGame();

        //改变攻防策略
        System.out.println("改变攻防策略，攻防交换");
        team1.setTeamStrategy(defendStrategy);
        team1.playGame();
        team2.setTeamStrategy(attackStrategy);
        team2.playGame();

        //装饰器模式，为非守门员的球员添加前锋、后卫等职能
        System.out.println("为非守门员的球员添加前锋、后卫等职能");
        PlayerRole[] playerRoles1 = new PlayerRole[10];
        PlayerRole[] playerRoles2 = new PlayerRole[10];
        //球队1
        for(int i=0;i<3;i++){
            playerRoles1[i] = new Defender();
            playerRoles1[i].setPlayer(player1[i+1]);
            playerRoles1[i].passBall();
            playerRoles1[i].task();
        }

        for(int i=3;i<6;i++){
            playerRoles1[i] = new MidFielder();
            playerRoles1[i].setPlayer(player1[i+1]);
            playerRoles1[i].passBall();
            playerRoles1[i].task();
        }

        for(int i=6;i<10;i++){
            playerRoles1[i] = new Forward();
            playerRoles1[i].setPlayer(player1[i+1]);
            playerRoles1[i].passBall();
            playerRoles1[i].task();
        }

        //球队2
        for(int i=0;i<3;i++){
            playerRoles2[i] = new Forward();
            playerRoles2[i].setPlayer(player2[i+1]);
            playerRoles2[i].passBall();
            playerRoles2[i].task();
        }

        for(int i=3;i<6;i++){
            playerRoles2[i] = new MidFielder();
            playerRoles2[i].setPlayer(player2[i+1]);
            playerRoles2[i].passBall();
            playerRoles2[i].task();
        }

        for(int i=6;i<10;i++){
            playerRoles2[i] = new Defender();
            playerRoles2[i].setPlayer(player2[i+1]);
            playerRoles2[i].passBall();
            playerRoles2[i].task();
        }

    }

}
