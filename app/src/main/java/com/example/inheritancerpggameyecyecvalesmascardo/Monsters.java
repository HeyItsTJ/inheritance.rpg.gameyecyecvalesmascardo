package com.example.inheritancerpggameyecyecvalesmascardo;

import java.text.DecimalFormat;

public class Monsters {
    private String monClass;
    private String monName;
    private int monID;
    private int monLevel;

    private double baseStrength;
    private double baseAgility;
    private double baseIntelligence;

    private double monStrength;
    private double monAgility;
    private double monIntelligence;

    DecimalFormat df = new DecimalFormat("0");

    public Monsters(String monclass, String name, int id, int level) {
        monClass = monclass;
        monName =name;
        monID = id;
        monLevel = level;
    }

    public String getMonClass() {
        return monClass;
    }

    public void setMonClass(String monclass) {
        monClass = monclass;
    }

    public String getMonName() {
        return monName;
    }
    public void setMonName(String name) {
        monName = name;
    }

    public int getMonID() {
        return monID;
    }
    public void setMonID(int id) {
        monID = id;
    }

    public int getMonLevel() {
        return monLevel;
    }

    public void setMonLevel(int level) {
        monLevel = level;
    }

    public void monStat(double strength, double agility, double intelligence) {
        baseStrength = strength;
        baseAgility = agility;
        baseIntelligence = intelligence;
    }

    public double computeStrength() {
        monStrength = baseStrength+(Double.valueOf(monLevel-1)*2.2);
        return monStrength;
    }

    public double computeAgility() {
        monAgility = baseAgility+(Double.valueOf(monLevel-1)*2.8);
        return monAgility;
    }

    public double computeIntelligence() {
        monIntelligence = baseIntelligence+(Double.valueOf(monLevel-1)*1.4);
        return monIntelligence;
    }

    public double computeHP() {
        double monHealth = 400 + (20*monStrength);
        return monHealth;
    }

    public double computeMP() {
        double monMana = 85 + (12*monIntelligence);
        return monMana;
    }

    public double computePhysicalDmg() {
        double monPhysicalAtk = 16 + monAgility;
        return monPhysicalAtk;
    }

    public double computePhysicalDef() {
        double monPhysicalDef = 20 + monStrength;
        return monPhysicalDef;
    }

    public double computeMagicDmg() {
        double monMagicAtk = 16 + monIntelligence;
        return monMagicAtk;
    }

    public double computeMagicDef() {
        double monMagicDef = 20 + monIntelligence;
        return monMagicDef;
    }
}
