package br.edu.ifsp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import br.edu.ifsp.model.Person;
import br.edu.ifsp.repository.PersonRepository;

@Service
public class PersonServices {
	
	private final String notFind = "Não encontramos registros para este ID";
	
	@Autowired
	PersonRepository repository;
	
	public Person create(Person person) {
		return repository.save(person);
	}
	
	public List<Person> findAll() {
		return repository.findAll();
	}	
	
	public Person findById(Long id) {
		return repository.findById(id).orElseThrow( () -> new ResourceNotFoundException(this.notFind) );
	}	
	
	
	public Person update(Person person) {
		Person entiy = repository.findById(person.getId()).orElseThrow( () -> new ResourceNotFoundException(this.notFind) );
		
		entiy.setFirstName(person.getFirstName());
		entiy.setLastName(person.getLastName());
		entiy.setAddress(person.getAddress());
		entiy.setGender(person.getGender());
		
		return repository.save(entiy);
	}
	
	public void delete(Long id) {
		Person entiy = repository.findById(id).orElseThrow( () -> new ResourceNotFoundException(this.notFind) );
		repository.delete(entiy);
	}	

}
