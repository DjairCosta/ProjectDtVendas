package com.daytech.dtvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daytech.dtvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
