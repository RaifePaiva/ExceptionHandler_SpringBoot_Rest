package br.com.estudodeexcecoes.service;

import br.com.estudodeexcecoes.entities.Person;
import br.com.estudodeexcecoes.repositories.PersonRepository;
import br.com.estudodeexcecoes.service.exceptions.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person buscar(Long id){
        Optional<Person> person = personRepository.findById(id);
        return person.orElseThrow(() -> new PersonNotFoundException("Este usuário não existe!"));
    }



}
