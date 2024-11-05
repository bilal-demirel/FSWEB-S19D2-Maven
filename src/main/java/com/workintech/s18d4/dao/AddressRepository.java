package com.workintech.s18d4.dao;

import com.workintech.s18d4.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {


}
