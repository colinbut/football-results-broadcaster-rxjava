package com.mycompany.frb;

import com.mycompany.frb.infrastructure.client.Client;
import com.mycompany.frb.infrastructure.server.Broadcaster;
import com.mycompany.frb.model.FootballEvent;
import com.mycompany.frb.model.FootballTeam;
import org.apache.log4j.Logger;


/**
 * Application
 */
public final class FootballResultsBroadcaster {

    private static final Logger LOGGER = Logger.getLogger(FootballResultsBroadcaster.class);

    private FootballResultsBroadcaster() {
        LOGGER.info("Init FootballResultsBroadcaster");
    }


    public static void main(String[] args){

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
