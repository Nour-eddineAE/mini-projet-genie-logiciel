package com.example.mini_projet_g_logiciel;

import com.example.mini_projet_g_logiciel.entities.Conducteur;
import com.example.mini_projet_g_logiciel.service.conducteur.ConducteurService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MiniProjetGLogicielApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniProjetGLogicielApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ConducteurService conducteurService){
        return args -> {
            // TODO (test)
            conducteurService.saveDriver(new Conducteur(null, "test", "test", new Date(), "test", null, null, null));
        };
    }
}
