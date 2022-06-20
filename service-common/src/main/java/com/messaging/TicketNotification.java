package com.messaging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketNotification {

    private String ticketId;
    private String accountId;
    private String ticketDescription;
}
