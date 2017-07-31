package com.cdk.api;

/**
 * Created by karodes on 7/29/2017.
 */
@FunctionalInterface
public interface Messenger {
    void sendMessage(String from,String to,String message,String platform);
}
