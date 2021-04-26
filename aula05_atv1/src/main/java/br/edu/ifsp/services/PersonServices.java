package br.edu.ifsp.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.edu.ifsp.model.Person;

@Service
public class PersonServices {
	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		Person person = new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirstName("Pedro");
		person.setLastName("Igor B. S.");
		person.setAddress(" Mar da Tranqulidade, Lua");
		person.setGender("Male");
		return person;
	}

}
