package br.com.IntellijProject.PrimeiroProjeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrimeiroProjetoApplication {

	@GetMapping("/hello")
	public String helloWorld () {
		return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoApplication.class, args);

	}


}
