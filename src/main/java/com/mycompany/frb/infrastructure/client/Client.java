/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.frb.infrastructure.client;

import com.mycompany.frb.model.FootballResult;
import rx.Subscriber;

public class Client {

    public Subscriber<FootballResult> listen() {
        return new Subscriber<FootballResult>() {
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
    }
}
