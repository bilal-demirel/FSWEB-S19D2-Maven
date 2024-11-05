package com.workintech.s18d4.service;

import com.workintech.s18d4.dao.AddressRepository;
import com.workintech.s18d4.entity.Address;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements  AddressService{
    AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }
    @Override
    public List<Address> getAllAddress(){
        return addressRepository.findAll();
    }
    @Override
    public Address getAddressById(Long id){
        Optional<Address> optionalAddress = addressRepository.findById(id);
        return optionalAddress.orElse(null);
    }
    @Override
    public Address addAddress(Address address){
        addressRepository.save(address);
        return address;
    }
    @Override
    public Address updateAddress(Long id){
        Optional<Address> optionalAddress = addressRepository.findById(id);
        if(optionalAddress.isPresent()){
            optionalAddress.get().setDescription(optionalAddress.get().getDescription() + "UPDATED");
            return addressRepository.save(optionalAddress.get());
        } else{
            return null;
        }
    }
    @Override
    public Address deleteAddress(Long id){
        Optional<Address> optionalAddress = addressRepository.findById(id);
        if(optionalAddress.isPresent()){
            addressRepository.deleteById(id);
            return optionalAddress.get();
        } else return null;
    }
}
