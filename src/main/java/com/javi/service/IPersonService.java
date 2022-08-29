package com.javi.service;

import com.javi.domain.Person;
import java.util.List;

public interface IPersonService {
    public List<Person> listPersons();

    public void save(Person person);

    public void delete(Person person);

    public Person findPerson(Person person);
}
