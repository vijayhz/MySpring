package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Person;

@Repository
public interface PersonDAO extends JpaRepository<Person, Long> {

}
