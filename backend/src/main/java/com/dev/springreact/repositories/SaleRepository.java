package com.dev.springreact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.springreact.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
