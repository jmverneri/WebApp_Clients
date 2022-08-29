package com.javi.dao;

import com.javi.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDAO extends CrudRepository<Person, Long> {
}
