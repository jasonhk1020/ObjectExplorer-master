package com.thinkful.zcarter.objectexplorer;

/**
 * Created by jasonhk1020 on 4/12/2015.
 */
public class ApplicationSettings {
    private static ApplicationSettings ourInstance = new ApplicationSettings();
    public String gameDifficulty;
    public String homeTeamName;
    public String awayTeamName;
    int numberOfBallsInGame;

    public static ApplicationSettings getInstance() {
        return ourInstance;
    }

    private ApplicationSettings() {
        this.gameDifficulty = "easy";
        this.homeTeamName = "redSocks";
        this.awayTeamName = "bluSocks";
        this.numberOfBallsInGame = 1;

    }
}
