package com.example.Baldurs_Gate_Spell_Finder;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpellService {

private final SpellRepository spellRepository;
private final List<Spell> spells;
private final List<Spell> spellList = List.of(new Spell("Magic Missile", 1, "Evocation", "Attack Spell"),
                                               new Spell("Fireball", 3, "Evocation", "Fireball attack"));


    public SpellService(SpellRepository spellRepository, List<Spell> spells) {
        this.spellRepository = spellRepository;
        this.spells = spells;
    }

    public void saveSpellsToDatabase(){

        for (Spell spell: spells){
            spellRepository.save(spell);
        }
    }
}
