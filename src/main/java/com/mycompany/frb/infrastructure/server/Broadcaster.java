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
import rx.Observable;
import rx.Subscriber;

public class Broadcaster {

    public static void broadcastFeed() {

        Observable<FootballResult> footballResultObservable = Observable.create(subscriber -> {
            int i = 0;
            while (i < 100) {
                FootballResult footballResult = new FootballResult();
                footballResult.setLeague(League.PREMIER_LEAGUE);
                footballResult.setHomeTeam(new FootballTeam("Arsenal"));
                footballResult.setAwayTeam(new FootballTeam("Manchester United"));
                footballResult.setHomeTeamGoalScored(1);
                footballResult.setAwayTeamGoalScored(0);
                footballResult.setFootballEvent(new FootballEvent(FootballEventType.GOAL_SCORED, new Footballer("Alexis Sanchez"), "53"));

                subscriber.onNext(footballResult);
                i++;
            }

            subscriber.onCompleted();
        });

        Subscriber<FootballResult> footballResultSubscriber = new Subscriber<FootballResult>() {
            @Override
            public void onCompleted() {
                System.out.println("Broadcasting completed");
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error occurred during broadcast");
            }

            @Override
            public void onNext(FootballResult footballResult) {
                System.out.println(footballResult);
            }
        };

        footballResultObservable.subscribe(footballResultSubscriber);

    }

}
