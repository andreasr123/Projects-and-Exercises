package com.example.Baldurs_Gate_Spell_Finder;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpellRepository extends MongoRepository<Spell, String> {
}
