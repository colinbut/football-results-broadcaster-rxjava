/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.frb.infrastructure.client;

import rx.Subscriber;

public final class Client {

    public static Subscriber<String> listen() {
        return new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("Broadcasting completed");
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error occurred during broadcast");
            }

            @Override
            public void onNext(String footballResult) {
                System.out.println(footballResult);
            }
        };
    }
}
