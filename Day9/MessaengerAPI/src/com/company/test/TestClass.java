package com.company.test;

import com.company.api.MessengerService;

/**
 * Created by karodes on 7/29/2017.
 */
public class TestClass {
    public static void main(String[] args) {
        MessengerService.sendMessage("Mahesh","Sameer","Hi dude !","WhatsApp",(String to,String from,String message,String platform)->{
            System.out.printf("Message from %s is sent to %s saying %s through %s platform\n",from,to,message,platform);
        });
        MessengerService.sendMessage("Mahesh","Sameer","Hi bhai !","Facebook",(String to,String from,String message,String platform)->{
            System.out.printf("Message from %s is sent to %s saying %s through %s platform\n",from,to,message,platform);
        });

        MessengerService.sendMessage("Mahesh","Sameer","Hi bhau !","HipChat",(String to,String from,String message,String platform)->{
            System.out.printf("Message from %s is sent to %s saying %s through %s platform\n",from,to,message,platform);
        });

        MessengerService.sendMessage("Mahesh","Sameer","Hi Mr !","Jabber",(String to,String from,String message,String platform)->{
            System.out.printf("Message from %s is sent to %s saying %s through %s platform\n",from,to,message,platform);
        });

    }
}
