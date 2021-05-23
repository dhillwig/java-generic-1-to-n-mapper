package de.hillwig.mapper;

import de.hillwig.creator.LoginNameCreator;
import de.hillwig.dto.Person;
import de.hillwig.dto.User;
import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

class PersonUserMapperTest {

    @Test
    void shouldMapUserProperties() {

        EasyRandom generator = new EasyRandom();
        Person mockedPerson = generator.nextObject(Person.class);

        User result = PersonUserMapper.mapUser(mockedPerson);

        assertThat(result.getId(), is(mockedPerson.getId()));
        assertThat(result.getFirstName(), is(mockedPerson.getFirstName()));
        assertThat(result.getLastName(), is(mockedPerson.getLastName()));
        assertThat(result.getLoginName(), is(new LoginNameCreator(mockedPerson).getLoginName()));
    }
}