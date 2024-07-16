package br.com.debora.screenmatch_web;

import br.com.debora.screenmatch_web.principal.Principal;
import br.com.debora.screenmatch_web.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchComJpaApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchComJpaApplication.class, args);
	}

}
