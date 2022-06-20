package com.account_service.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.account_service.entity.Account;

@Repository
public interface AccountRepository extends CassandraRepository<Account, String> {

}
