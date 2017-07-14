package context;

import strategy.TeamStrategy;

/**
 * Created by 平 on 2017/7/6.
 */
public class Team {

    private String teamName;

    private TeamStrategy teamStrategy;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamStrategy(TeamStrategy strategy){
        this.teamStrategy = strategy;
    }

    public void playGame(){
        System.out.println(teamName);
        teamStrategy.play();
    }

}
