package com.account_service.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.client.contract.AccountDto;
import com.account_service.entity.Account;
import com.account_service.repository.AccountRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {
	
	private final AccountRepository accountRepository;
	private final ModelMapper modelMapper;
	
	public AccountDto get(String id) {
		Account account = accountRepository.findById(id).orElseThrow(IllegalArgumentException::new);
		return modelMapper.map(account, AccountDto.class);
	}
	
    public Slice<AccountDto> findAll(Pageable pageable) {
//        Slice<Account> accounts = accountRepository.findAll(pageable);
        return null;
    }
	
	@Transactional
	public AccountDto save(AccountDto accountDto) {
		Account account = modelMapper.map(accountDto, Account.class);
		account = accountRepository.save(account);
		accountDto.setId(account.getId());
		return accountDto;
	}
	
    @Transactional
    public AccountDto update(String id, AccountDto accountDto) {
        Assert.isNull(id, "Id cannot be null");
        Optional<Account> account = accountRepository.findById(id);
        Account accountToUpdate = account.map(it -> {
							            it.setBirthDate(accountDto.getBirthDate());
							            it.setName(accountDto.getName());
							            it.setSurname(accountDto.getSurname());
							            return it;
        }).orElseThrow(IllegalArgumentException::new);
        return modelMapper.map(accountRepository.save(accountToUpdate), AccountDto.class);
    }
	
    @Transactional
    public void delete(String id) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
        accountRepository.delete(account);
    }
}
