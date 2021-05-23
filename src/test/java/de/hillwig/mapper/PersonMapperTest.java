package de.hillwig.mapper;

import de.hillwig.creator.LoginNameCreator;
import de.hillwig.dto.Address;
import de.hillwig.dto.Person;
import de.hillwig.dto.User;
import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

class PersonMapperTest {

    @Test
    void shouldMapAddress() {

        EasyRandom generator = new EasyRandom();
        Person mockedPerson = generator.nextObject(Person.class);

        Address result = PersonMapper.mapPerson(mockedPerson, PersonAddressMapper::mapAddress);

        assertThat(result.getStreet(), is(mockedPerson.getStreet()));
        assertThat(result.getPostalCode(), is(mockedPerson.getPostalCode()));
        assertThat(result.getCity(), is(mockedPerson.getCity()));
        assertThat(result.getCountry().value(), is(mockedPerson.getCountry().value()));

    }

    @Test
    void shouldMapUser() {

        EasyRandom generator = new EasyRandom();
        Person mockedPerson = generator.nextObject(Person.class);

        User result = PersonMapper.mapPerson(mockedPerson, PersonUserMapper::mapUser);

        assertThat(result.getId(), is(mockedPerson.getId()));
        assertThat(result.getFirstName(), is(mockedPerson.getFirstName()));
        assertThat(result.getLastName(), is(mockedPerson.getLastName()));
        assertThat(result.getLoginName(), is(new LoginNameCreator(mockedPerson).getLoginName()));

    }
}