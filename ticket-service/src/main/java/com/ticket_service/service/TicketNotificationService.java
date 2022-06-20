package com.ticket_service.service;

import com.ticket_service.entity.Ticket;

public interface TicketNotificationService {
	
	void sendToQueue(Ticket ticket);
}
