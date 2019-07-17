/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.frb.util;

import com.mycompany.frb.model.FootballResult;
import com.mycompany.frb.model.FootballTeam;
import com.mycompany.frb.model.FootballTeamFactory;
import com.mycompany.frb.model.League;
import com.mycompany.frb.model.PremierLeagueFootballClub;

import java.util.Random;

public class RandomResultsDataGenerator {

    private FootballTeamFactory footballTeamFactory = new FootballTeamFactory();

    public void generate() {

        League league = getRandomPickedLeague();

        FootballResult footballResult = new FootballResult();
        footballResult.setLeague(league);
        footballResult.setHomeTeam(getRandomHomeTeamFromLeague(league));

    }

    private FootballTeam getRandomHomeTeamFromLeague(League league) {

        Random randomHomeTeamPicker = new Random();

        if (league == League.PREMIER_LEAGUE) {
            return footballTeamFactory.getFootballTeam(randomHomeTeamPicker.nextInt(PremierLeagueFootballClub.values().length - 1));
        }
        return null;
    }


    private League getRandomPickedLeague() {
        Random randomLeaguePicker = new Random();
        int pickedLeaguePosition = randomLeaguePicker.nextInt(League.values().length);
        for (League league : League.values()) {
            if (league.ordinal() == pickedLeaguePosition) {
                return league;
            }
        }
        throw new IllegalStateException("Something went wrong in trying to select a League");
    }
}
