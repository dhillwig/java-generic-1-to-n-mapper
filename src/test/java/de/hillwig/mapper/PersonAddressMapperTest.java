package de.hillwig.mapper;

import de.hillwig.dto.Address;
import de.hillwig.dto.Person;
import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

class PersonAddressMapperTest {

    @Test
    void shouldMapAddressProperties() {

        EasyRandom generator = new EasyRandom();
        Person mockedPerson = generator.nextObject(Person.class);

        Address result = PersonAddressMapper.mapAddress(mockedPerson);

        assertThat(result.getStreet(), is(mockedPerson.getStreet()));
        assertThat(result.getPostalCode(), is(mockedPerson.getPostalCode()));
        assertThat(result.getCity(), is(mockedPerson.getCity()));
        assertThat(result.getCountry().value(), is(mockedPerson.getCountry().value()));
    }

}