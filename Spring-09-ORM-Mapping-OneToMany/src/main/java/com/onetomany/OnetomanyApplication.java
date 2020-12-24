package com.onetomany;

import com.onetomany.entity.Address;
import com.onetomany.entity.Person;
import com.onetomany.repository.AddressRepository;
import com.onetomany.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class OnetomanyApplication implements CommandLineRunner {

    PersonRepository personRepository;
    AddressRepository addressRepository;

    @Autowired
    public OnetomanyApplication(PersonRepository personRepository, AddressRepository addressRepository) {
        this.personRepository = personRepository;
        this.addressRepository = addressRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(OnetomanyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person p1 = new Person("Mike", "Smith");
        Person p2 = new Person("Mehmet", "Icme");
        Person p3 = new Person("Rasit", "Icme");


        Address a1 = new Address("King Street", "22052");
        Address a2 = new Address("Queen Street", "56825");
        Address a3 = new Address("Elm Street", "75012");


        personRepository.save(p1);

        a1.setPerson(p1);
        a2.setPerson(p1);
        a3.setPerson(p3);


        addressRepository.save(a1);
        addressRepository.save(a2);
        addressRepository.save(a3);

    }
}
