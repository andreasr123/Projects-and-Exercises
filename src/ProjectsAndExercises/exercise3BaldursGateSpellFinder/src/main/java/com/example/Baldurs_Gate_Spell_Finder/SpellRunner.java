package com.example.Baldurs_Gate_Spell_Finder;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpellRunner {

    @Bean
    ApplicationRunner runner(SpellService service, SpellRepository repository) {
        return args -> {
            if (repository.findAll().isEmpty()) {
                service.saveSpellsToDatabase();
            }
        };
    }
}
