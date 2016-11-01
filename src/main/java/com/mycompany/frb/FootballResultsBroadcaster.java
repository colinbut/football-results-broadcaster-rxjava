package com.mycompany.frb;

import com.mycompany.frb.infrastructure.client.Client;
import com.mycompany.frb.infrastructure.server.Broadcaster;

/**
 * Application
 */
public class FootballResultsBroadcaster {

    public static void main(String[] args){
        System.out.println("Application");

        Client client = new Client();
        Broadcaster broadcaster = new Broadcaster();

        broadcaster.broadcastFeed().subscribe(client.listen());
    }

}
