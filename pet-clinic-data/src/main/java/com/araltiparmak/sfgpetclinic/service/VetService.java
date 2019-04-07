package com.araltiparmak.sfgpetclinic.service;

import com.araltiparmak.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
