package com.araltiparmak.sfgpetclinic.service;

import com.araltiparmak.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
