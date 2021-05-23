package de.hillwig.mapper;

import de.hillwig.creator.LoginNameCreator;
import de.hillwig.dto.Person;
import de.hillwig.dto.User;

public class PersonUserMapper {

    private PersonUserMapper() {
    }

    public static User mapUser(Person person) {
        return new User()
                .withId(person.getId())
                .withFirstName(person.getFirstName())
                .withLastName(person.getLastName())
                .withLoginName(new LoginNameCreator(person).getLoginName());
    }
}