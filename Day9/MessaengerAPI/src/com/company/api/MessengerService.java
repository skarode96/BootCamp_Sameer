package com.company.api;

/**
 * Created by karodes on 7/29/2017.
 */
public class MessengerService {
    public static void sendMessage(String to,String from,String message,String platform,Messenger messenger){
        messenger.sendMessage(to,from,message,platform);
    }
}
