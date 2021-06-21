package br.com.estudodeexcecoes.repositories;

import br.com.estudodeexcecoes.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {



}
