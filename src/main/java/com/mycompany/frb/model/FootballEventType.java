/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.frb.model;

public enum FootballEventType {

    GOAL_SCORED ("GOAL SCORED"),
    YELLOW_CARD ("YELLOW CARD"),
    RED_CARD ("RED CARD"),
    FULL_TIME ("FT"),
    HALF_TIME ("HT"),
    GOAL_LATEST ("GL");

    private String code;

    FootballEventType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
