package com.workintech.s18d4.service;

import com.workintech.s18d4.entity.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    List<Address> getAllAddress();
    Address getAddressById(Long id);
    Address addAddress(Address address);
    Address updateAddress(Long id);
    Address deleteAddress(Long id);
}
