package yddimitrov.springframework.springpetclinic.services;

import yddimitrov.springframework.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
