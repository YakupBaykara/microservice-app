package com.ticket_service.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;

@MappedSuperclass
public abstract class BaseEntityModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@CreatedDate
	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;
}
