package yddimitrov.springframework.springpetclinic.services;

import yddimitrov.springframework.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();

}
