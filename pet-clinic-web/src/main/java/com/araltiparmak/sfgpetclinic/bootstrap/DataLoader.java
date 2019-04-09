package com.araltiparmak.sfgpetclinic.bootstrap;

import com.araltiparmak.sfgpetclinic.model.Owner;
import com.araltiparmak.sfgpetclinic.model.Vet;
import com.araltiparmak.sfgpetclinic.service.OwnerService;
import com.araltiparmak.sfgpetclinic.service.VetService;
import com.araltiparmak.sfgpetclinic.service.map.OwnerServiceMap;
import com.araltiparmak.sfgpetclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;

public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();

        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner1.setId(2L);
        owner1.setFirstName("Fiona");
        owner1.setLastName("Glenanne");
        ownerService.save(owner1);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Jessie");
        vet1.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
