package com.ticket_service.entity;

import lombok.Getter;

@Getter
public enum TicketStatus {

    OPEN("Acik"),
    IN_PROGRESS("Üzerinde Calisiliyor"),
    RESOLVED("Cözüldü"),
    CLOSED("Kapandi");

    private String label;

    TicketStatus(String label){
        this.label = label;
    }
}
