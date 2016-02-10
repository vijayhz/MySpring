package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Person;

public interface PersonDAO extends JpaRepository<Person, Long> {

}
