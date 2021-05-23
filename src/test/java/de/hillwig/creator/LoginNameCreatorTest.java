package de.hillwig.creator;

import de.hillwig.dto.Person;
import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

class LoginNameCreatorTest {

    @Test
    void shouldCreateLoginName() {

        EasyRandom generator = new EasyRandom();
        Person mockedPerson = generator.nextObject(Person.class);
        mockedPerson.setFirstName("John");
        mockedPerson.setLastName("Smith");

        String result = new LoginNameCreator(mockedPerson).getLoginName();

        assertThat(result, is("SmJo"));

    }

}