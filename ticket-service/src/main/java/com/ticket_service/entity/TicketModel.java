package com.ticket_service.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Builder
@EqualsAndHashCode(of = { "id" } )
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "ticket")
public class TicketModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    private String id;

    private String description;

    private String notes;

    private String assignee;

    private Date ticketDate;

    private String priorityType;

    private String ticketStatus;
}
