/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.frb.model;

public enum League {

    PREMIER_LEAGUE(LeagueCode.PREMIER_LEAGUE, "Premier League", "First Division"),
    CHAMPIONSHIP(LeagueCode.CHAMPIONSHIP, "The Championship", "Second Tier"),
    LEAGUE_ONE(LeagueCode.LEAGUE_ONE, "League One", "Third Tier"),
    LEAGUE_TWO(LeagueCode.LEAGUE_TWO, "League Two", "Fourth Tier"),
    CONFERENCE(LeagueCode.CONFERENCE, "The Conference", "Non-League");

    private String leagueCode;
    private String leagueName;
    private String leagueDescription;

    League(String leagueCode, String leagueName, String leagueDescription) {
        this.leagueCode = leagueCode;
        this.leagueName = leagueName;
        this.leagueDescription = leagueDescription;
    }

    public String getLeagueCode() {
        return leagueCode;
    }

    void setLeagueCode(String leagueCode) {
        this.leagueCode = leagueCode;
    }

    public String getLeagueName() {
        return leagueName;
    }

    void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueDescription() {
        return leagueDescription;
    }

    void setLeagueDescription(String leagueDescription) {
        this.leagueDescription = leagueDescription;
    }

}
