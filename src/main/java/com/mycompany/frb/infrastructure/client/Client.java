/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.frb.infrastructure.client;

import org.apache.log4j.Logger;
import rx.Subscriber;

public final class Client {

    private static final Logger LOGGER = Logger.getLogger(Client.class);

    private Client() {
        LOGGER.info("Init Client");
    }

    public static Subscriber<String> listen() {
        return new Subscriber<String>() {
            @Override
            public void onCompleted() {
                LOGGER.info("Broadcasting completed");
            }

            @Override
            public void onError(Throwable throwable) {
                LOGGER.error("Error occurred during broadcast");
            }

            @Override
            public void onNext(String footballResult) {
                LOGGER.info(footballResult);
            }
        };
    }
}
