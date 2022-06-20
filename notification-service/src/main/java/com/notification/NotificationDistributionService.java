package com.notification;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import com.messaging.TicketNotification;

@SuppressWarnings("deprecation")
@EnableBinding(Sink.class)
public class NotificationDistributionService {

    @StreamListener(Sink.INPUT)
    public void onNotification(TicketNotification ticketNotification){
        System.out.println("———————————————————————————————————————————");
        System.out.println("Notification Alindi Kullanicilara gönderiliyor.");
        System.out.println("Notification -> " + ticketNotification.toString());
    }
}
