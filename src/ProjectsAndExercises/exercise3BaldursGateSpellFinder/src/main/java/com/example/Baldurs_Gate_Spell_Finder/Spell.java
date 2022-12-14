package com.example.Baldurs_Gate_Spell_Finder;

import java.util.Objects;

public class Spell {

    String id;
    String spellName;
    int spellLevel;
    String school;
    String description;

    public Spell() {
    }

    public Spell(String spellName, int spellLevel, String school, String description) {
        this.spellName = spellName;
        this.spellLevel = spellLevel;
        this.school = school;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public int getSpellLevel() {
        return spellLevel;
    }

    public void setSpellLevel(int spellLevel) {
        this.spellLevel = spellLevel;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spell spell = (Spell) o;
        return spellLevel == spell.spellLevel && Objects.equals(id, spell.id) && Objects.equals(spellName, spell.spellName) && Objects.equals(school, spell.school) && Objects.equals(description, spell.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, spellName, spellLevel, school, description);
    }

    @Override
    public String toString() {
        return "Spell{" +
                "id='" + id + '\'' +
                ", spellName='" + spellName + '\'' +
                ", spellLevel=" + spellLevel +
                ", school='" + school + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
