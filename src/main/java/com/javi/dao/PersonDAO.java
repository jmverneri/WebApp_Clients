package com.javi.dao;

import com.javi.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDAO extends JpaRepository<Person, Long> {
}
