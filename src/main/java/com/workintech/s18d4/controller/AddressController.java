package com.workintech.s18d4.controller;

import com.workintech.s18d4.entity.Address;
import com.workintech.s18d4.service.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    AddressService addressService;

    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }
    @GetMapping("/")
    public ResponseEntity<List<Address>> getAllAddress(){
        return ResponseEntity.ok(addressService.getAllAddress());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable Long id){
        return ResponseEntity.ok(addressService.getAddressById(id));
    }
    @PostMapping("/")
    public ResponseEntity<Address> addAddress(@RequestBody Address address){
        return ResponseEntity.ok(addressService.addAddress(address));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Address> updateAddress(@PathVariable Long id){
        return ResponseEntity.ok(addressService.updateAddress(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Address> deleteAddress(@PathVariable Long id){
        return ResponseEntity.ok(addressService.deleteAddress(id));
    }
}
