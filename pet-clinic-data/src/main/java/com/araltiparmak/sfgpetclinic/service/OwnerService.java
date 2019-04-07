package com.araltiparmak.sfgpetclinic.service;

import com.araltiparmak.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

    default String a() {
        return "a";
    }

    static String b() {
        return "b";
    }


}
