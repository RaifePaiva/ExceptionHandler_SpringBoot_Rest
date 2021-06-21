package br.com.estudodeexcecoes;

import br.com.estudodeexcecoes.entities.Person;
import br.com.estudodeexcecoes.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcecoesApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExcecoesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Person person = new Person(null, "Jonas pinto", 31);

		personRepository.save(person);


	}
}
