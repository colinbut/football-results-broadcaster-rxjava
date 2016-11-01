/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.frb.model;


public class FootballEvent {

    private FootballEventType footballEventType;
    private Footballer footballer;
    private String timeHappenedInMinutes;

    public FootballEvent(FootballEventType footballEventType, Footballer footballer, String timeHappenedInMinutes) {
        this.footballEventType = footballEventType;
        this.footballer = footballer;
        this.timeHappenedInMinutes = timeHappenedInMinutes;
    }

    public FootballEventType getFootballEventType() {
        return footballEventType;
    }

    public Footballer getFootballer() {
        return footballer;
    }

    public String getTimeHappenedInMinutes() {
        return timeHappenedInMinutes;
    }

}
