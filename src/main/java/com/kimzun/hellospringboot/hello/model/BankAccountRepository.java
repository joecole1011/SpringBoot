package com.kimzun.hellospringboot.hello.model;

import org.springframework.data.repository.CrudRepository;

public interface BankAccountRepository extends CrudRepository<BankAccount, Integer> {

}
