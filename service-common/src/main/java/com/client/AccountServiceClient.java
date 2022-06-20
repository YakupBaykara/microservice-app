package com.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.client.contract.AccountDto;

@FeignClient("account-service")
public interface AccountServiceClient {
    @RequestMapping("/account/{id}")
    ResponseEntity<AccountDto> get(@PathVariable("id") String id);
}
