package com.araltiparmak.sfgpetclinic.service;

import com.araltiparmak.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
