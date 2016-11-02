/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.frb.infrastructure.server;

import com.mycompany.frb.model.FootballEvent;
import com.mycompany.frb.model.FootballEventType;
import com.mycompany.frb.model.FootballResult;
import com.mycompany.frb.model.FootballTeam;
import com.mycompany.frb.model.Footballer;
import com.mycompany.frb.model.League;
import org.apache.log4j.Logger;
import rx.Observable;

public final class Broadcaster {

    private static final Logger LOGGER = Logger.getLogger(Broadcaster.class);

    private Broadcaster() {
        LOGGER.info("Init Broadcaster");
    }


    public static Observable<FootballResult> broadcastFeed() {

        return Observable.create(subscriber -> {

            LOGGER.info("Starting to emit");

            int i = 0;
            while (i < 100) {
                FootballResult footballResult = new FootballResult();
                footballResult.setLeague(League.PREMIER_LEAGUE);
                footballResult.setHomeTeam(new FootballTeam("Arsenal"));
                footballResult.setAwayTeam(new FootballTeam("Manchester United"));
                footballResult.setHomeTeamGoalScored(1);
                footballResult.setAwayTeamGoalScored(0);
                footballResult.setFootballEvent(new FootballEvent(FootballEventType.GOAL_SCORED, new Footballer("Alexis Sanchez"), "53"));

                LOGGER.debug("Emitting: " + footballResult);
                subscriber.onNext(footballResult);
                i++;
            }

            LOGGER.info("Finished emitting");
            subscriber.onCompleted();
        });

    }

}
