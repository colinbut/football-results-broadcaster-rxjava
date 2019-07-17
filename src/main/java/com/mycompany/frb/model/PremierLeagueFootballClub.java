/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.frb.model;

import java.util.HashMap;
import java.util.Map;

public enum PremierLeagueFootballClub {

    // Premier League
    AFC_BOURNEMOUTH,
    ARSENAL,
    BURNLEY,
    CHELSEA,
    CRYSTAL_PALACE,
    EVERTON,
    HULL_CITY,
    LEICESTER_CITY,
    LIVERPOOL,
    MANCHESTER_CITY,
    MANCHESTER_UNITED,
    MIDDLESBROUGH,
    SOUTHAMPTON,
    STOKE_CITY,
    SUNDERLAND,
    SWANSEA_CITY,
    TOTTENHAM_HOTSPUR,
    WATFORD,
    WEST_BROMWICH_ALBION,
    WEST_HAM_UNITED;

    private static Map<String, PremierLeagueFootballClub> premierLeagueClubs = new HashMap<>();

    static {
        for (PremierLeagueFootballClub premierLeagueFootballClub : PremierLeagueFootballClub.values()) {
            premierLeagueClubs.put(premierLeagueFootballClub.name(), premierLeagueFootballClub);
        }
    }

    public static Map<String, PremierLeagueFootballClub> getPremierLeagueClubs() {
        return premierLeagueClubs;
    }

}
