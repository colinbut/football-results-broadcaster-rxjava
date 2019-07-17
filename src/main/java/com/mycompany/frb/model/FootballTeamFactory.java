/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.frb.model;

import java.util.HashMap;
import java.util.Map;

public class FootballTeamFactory {

    private Map<PremierLeagueFootballClub, FootballTeam> premierLeagueFootballClubFootballTeamMap = new HashMap<>();

    public FootballTeamFactory() {
        for (PremierLeagueFootballClub premierLeagueFootballClub : PremierLeagueFootballClub.values()) {
            premierLeagueFootballClubFootballTeamMap.put(premierLeagueFootballClub,
                new FootballTeam(premierLeagueFootballClub.name().replace("_"," ")));
        }
    }

    public FootballTeam getFootballTeam(int teamPosition) {

        if (teamPosition < 0 || teamPosition >= premierLeagueFootballClubFootballTeamMap.size()) {
            throw new IllegalArgumentException("Illegal team position passed in");
        }

        int i = 0;
        for (PremierLeagueFootballClub premierLeagueFootballClub : premierLeagueFootballClubFootballTeamMap.keySet()) {
            if (i == teamPosition) {
                return premierLeagueFootballClubFootballTeamMap.get(premierLeagueFootballClub);
            }
            i++;
        }

        throw new IllegalStateException("Unable to get football team");
    }
}
