package de.hillwig.mapper;

import de.hillwig.dto.Address;
import de.hillwig.dto.Person;

public class PersonAddressMapper {

    private PersonAddressMapper() {
    }

    public static Address mapAddress(Person person) {
        return new Address()
                .withStreet(person.getStreet())
                .withPostalCode(person.getPostalCode())
                .withCity(person.getCity())
                .withCountry(Address.Country.fromValue(person.getCountry().value()));
    }
}