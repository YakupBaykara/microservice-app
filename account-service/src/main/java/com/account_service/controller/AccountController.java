package com.account_service.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.contract.AccountDto;
import com.account_service.service.AccountService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

	private final AccountService accountService;
	
	@GetMapping("/{id}")
	public ResponseEntity<AccountDto> get(@PathVariable("id") String id) {
		return ResponseEntity.ok(accountService.get(id));
	}
	
    @GetMapping
    public ResponseEntity<Slice<AccountDto>> getAll(Pageable pageable) {
        return ResponseEntity.ok(accountService.findAll(pageable));
    }
	
	@PostMapping
	public ResponseEntity<AccountDto> save(@RequestBody AccountDto accountDto) {
		return ResponseEntity.ok(accountService.save(accountDto));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<AccountDto> update(@PathVariable("id") String id, @RequestBody AccountDto accountDto) {
		return ResponseEntity.ok(accountService.update(id, accountDto));
	}
	
	@DeleteMapping
	public void delete(String id) {
		accountService.delete(id);
	}
}
