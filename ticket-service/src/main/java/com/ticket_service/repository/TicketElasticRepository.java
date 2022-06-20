package com.ticket_service.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.ticket_service.entity.TicketModel;

@Repository
public interface TicketElasticRepository extends ElasticsearchRepository<TicketModel, String>{

}
