package de.hillwig.mapper;

import de.hillwig.dto.Person;

import java.util.function.Function;

public class PersonMapper {

    private PersonMapper() {
    }

    public static <R> R mapPerson(Person person,
                                  Function<Person, R> mapper) {
        return mapper.apply(person);
    }
}