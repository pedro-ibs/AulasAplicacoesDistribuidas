package br.edu.ifsp.repository;

import org.springframework.stereotype.Repository;

import br.edu.ifsp.model.Person;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
