package com.example.inheritancerpggameyecyecvalesmascardo;

import java.text.DecimalFormat;

public class Hero {
    private String heroClass;
    private String heroName;
    private int heroID;
    private int heroLevel;

    private double baseStrength;
    private double baseAgility;
    private double baseIntelligence;

    private double heroStrength;
    private double heroAgility;
    private double heroIntelligence;

    DecimalFormat df = new DecimalFormat("0");

    public Hero(String hero_class, String name, int id, int level) {
        heroClass = hero_class;
        heroName = name;
        heroID = id;
        heroLevel = level;
    }

    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String hero_class) {
        heroClass = hero_class;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String name) {
        heroName = name;
    }
    public int getHeroID() {
        return heroID;
    }

    public void setHeroID(int id) {
        heroID = id;
    }

    public int getHeroLevel() {
        return heroLevel;
    }

    public void setHeroLevel(int level) {
        heroLevel = level;
    }

    public void heroStat(double strength, double agility, double intelligence) {
        baseStrength = strength;
        baseAgility = agility;
        baseIntelligence = intelligence;
    }

    public double computeStrength() {
        heroStrength = baseStrength+(Double.valueOf(heroLevel-1)*2.2);
        return heroStrength;
    }

    public double computeAgility() {
        heroAgility = baseAgility+(Double.valueOf(heroLevel-1)*2.8);
        return heroAgility;
    }

    public double computeIntelligence() {
        heroIntelligence = baseIntelligence+(Double.valueOf(heroLevel-1)*1.4);
        return heroIntelligence;
    }

    public double computeHP() {
        double heroHealth = 200 + (20*heroStrength);
        return heroHealth;
    }

    public double computeMP() {
        double heroMana = 75 + (12*heroIntelligence);
        return heroMana;
    }

    public double computePhysicalDmg() {
        double heroPhysicalAtk = 16 + heroAgility;
        return heroPhysicalAtk;
    }

    public double computePhysicalDef() {
        double heroPhysicalDef = 20 + heroStrength;
        return heroPhysicalDef;
    }

    public double computeMagicDmg() {
        double heroMagicAtk = 16 + heroIntelligence;
        return heroMagicAtk;
    }

    public double computeMagicDef() {
        double heroMagicDef = 20 + heroIntelligence;
        return heroMagicDef;
    }
}
