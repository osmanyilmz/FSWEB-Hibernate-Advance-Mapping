package com.workintech.s18d4.service;

import com.workintech.s18d4.entity.Address;
import com.workintech.s18d4.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    public Address find(long id) {
        return addressRepository.findById(id).orElse(null);
    }

    public Address save(Address address) {
        return addressRepository.save(address);
    }

    public Address update(long id, Address updatedAddress) {
        Optional<Address> optionalAddress = addressRepository.findById(id);
        if(optionalAddress.isPresent()) {
            Address address = optionalAddress.get();
            address.setStreet(updatedAddress.getStreet());
            address.setNo(updatedAddress.getNo());
            address.setCity(updatedAddress.getCity());
            address.setCountry(updatedAddress.getCountry());
            address.setDescription(updatedAddress.getDescription());
            return addressRepository.save(address);
        }
        return null;
    }

    public void delete(long id) {
        addressRepository.deleteById(id);
    }
}
