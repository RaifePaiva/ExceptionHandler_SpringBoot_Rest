package br.com.estudodeexcecoes.controllers;

import br.com.estudodeexcecoes.entities.Person;
import br.com.estudodeexcecoes.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(path = "{id}")
    public ResponseEntity<Person> find(@PathVariable Long id){
        Person person = personService.buscar(id);
        return ResponseEntity.ok().body(person);
    }



}
