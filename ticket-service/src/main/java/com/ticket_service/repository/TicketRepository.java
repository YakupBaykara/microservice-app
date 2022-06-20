package com.ticket_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket_service.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, String> {

}
