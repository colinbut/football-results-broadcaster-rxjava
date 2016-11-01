package com.mycompany.frb;

import com.mycompany.frb.infrastructure.client.Client;
import com.mycompany.frb.infrastructure.server.Broadcaster;
import com.mycompany.frb.model.FootballEvent;
import com.mycompany.frb.model.FootballTeam;


/**
 * Application
 */
public class FootballResultsBroadcaster {

    public static void main(String[] args){
        System.out.println("Application");

        Broadcaster
            .broadcastFeed()
                .map(footballResult -> {

                    FootballEvent footballEvent = footballResult.getFootballEvent();
                    FootballTeam homeTeam = footballResult.getHomeTeam();
                    FootballTeam awayTeam = footballResult.getAwayTeam();

                    return footballResult.getLeague() + " " + homeTeam.getClubName() + " "
                        + footballResult.getHomeTeamGoalScored() + "-" + footballResult.getAwayTeamGoalScored() + " "
                        + awayTeam.getClubName() + " "
                        + "(" + footballEvent.getFootballEventType() + " " + footballEvent.getFootballer().getName()
                        + " " + footballEvent.getTimeHappenedInMinutes() + " mins" + ")";
                })
                .subscribe(Client.listen());
    }

}
