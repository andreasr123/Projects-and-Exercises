package com.example.Baldurs_Gate_Spell_Finder;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("list")
public class SpellConfiguration {

    private List<Spell> spells;

    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    @Bean
    List<Spell> spells(){
        return spells;
    }
}
