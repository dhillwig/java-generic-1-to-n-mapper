package de.hillwig.creator;

import de.hillwig.dto.Person;

public class LoginNameCreator {

    private Person person;

    public LoginNameCreator(Person person) {
        this.person = person;
    }

    public String getLoginName() {
        return this.person.getLastName().substring(0, 2)
                + this.person.getFirstName().substring(0, 2);
    }
}