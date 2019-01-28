package yddimitrov.springframework.springpetclinic.services;

import yddimitrov.springframework.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();

}
