package yddimitrov.springframework.springpetclinic.services;

import yddimitrov.springframework.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
