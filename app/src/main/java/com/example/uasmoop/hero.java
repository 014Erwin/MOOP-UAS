package com.example.uasmoop;

public class hero {
    public int level;
    public String skill;
    public int skillboost;
    public int attackboost;
    public int attack;
    public int defense;
    public int health;

    public static int Archer_Attack= 0;
    public static int Infantry_Attack = 1;
    public static int Catapult_Attack = 2;
    public static int Cavalry_Attack = 3;

    public static int Maxlvl = 50;
    public static int Minhealth = 0;

    public int Attack_Hero;


    public static int getMaxlvl() {
        return Maxlvl;
    }


    public static void setMaxlvl(int maxlvl) {
        Maxlvl = maxlvl;
    }


    public static int getMinhealth() {
        return Minhealth;
    }


    public static void setMinhealth(int minhealth) {
        Minhealth = minhealth;
    }


    public int getLevel() {
        return level;
    }


    public void setLevel(int level) {
        this.level = level;
    }


    public String getSkill() {
        return skill;
    }


    public void setSkill(String skill) {
        this.skill = skill;
    }


    public int getSkillboost() {
        return skillboost;
    }


    public void setSkillboost(int skillboost) {
        this.skillboost = skillboost;
    }


    public int getAttackboost() {
        return attackboost;
    }


    public void setAttackboost(int attackboost) {
        this.attackboost = attackboost;
    }


    public int getAttack() {
        return attack;
    }


    public void setAttack(int attack) {
        this.attack = attack;
    }


    public int getDefense() {
        return defense;
    }


    public void setDefense(int defense) {
        this.defense = defense;
    }


    public int getHealth() {
        return health;
    }


    public void setHealth(int health) {
        this.health = health;
    }


    public hero() {

    }

    public hero(int level, String skill, int skillboost, int attackboost, int attack, int defense,
                int health) {
        super();
        this.level = level;
        this.skill = skill;
        this.skillboost = skillboost;
        this.attackboost = attackboost;
        this.attack = attack;
        this.defense = defense;
        this.health = health;



    }
    public static void main (String[] args) {
        // TODO Auto-generated method stub
    new hero();
}
}