/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.frb.model;

public class FootballResult {

    private League league;
    private FootballTeam homeTeam;
    private FootballTeam awayTeam;
    private Integer homeTeamGoalScored;
    private Integer awayTeamGoalScored;
    private FootballEvent footballEvent;

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public FootballTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(FootballTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public FootballTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(FootballTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Integer getHomeTeamGoalScored() {
        return homeTeamGoalScored;
    }

    public void setHomeTeamGoalScored(Integer homeTeamGoalScored) {
        this.homeTeamGoalScored = homeTeamGoalScored;
    }

    public Integer getAwayTeamGoalScored() {
        return awayTeamGoalScored;
    }

    public void setAwayTeamGoalScored(Integer awayTeamGoalScored) {
        this.awayTeamGoalScored = awayTeamGoalScored;
    }

    public FootballEvent getFootballEvent() {
        return footballEvent;
    }

    public void setFootballEvent(FootballEvent footballEvent) {
        this.footballEvent = footballEvent;
    }
}
