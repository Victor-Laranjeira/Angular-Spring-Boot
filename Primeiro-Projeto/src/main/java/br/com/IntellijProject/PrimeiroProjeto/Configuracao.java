package br.com.IntellijProject.PrimeiroProjeto;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class Configuracao {

    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("Configuração development ativada.");
        };
    }
}
