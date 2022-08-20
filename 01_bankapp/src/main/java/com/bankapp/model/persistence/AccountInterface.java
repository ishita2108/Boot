package com.bankapp.model.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.model.entity.Account;

@Repository
public interface AccountInterface extends JpaRepository<Account,Integer> {

}
