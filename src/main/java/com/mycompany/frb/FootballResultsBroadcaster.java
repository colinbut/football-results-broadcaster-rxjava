package com.mycompany.frb;

import com.mycompany.frb.infrastructure.server.Broadcaster;

/**
 * Application
 */
public class FootballResultsBroadcaster {

    public static void main(String[] args){
        System.out.println("Application");
        Broadcaster.broadcastFeed();
    }

}
