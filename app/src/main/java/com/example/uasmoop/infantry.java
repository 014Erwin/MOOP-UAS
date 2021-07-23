package com.example.uasmoop;


public class infantry extends hero {

    public infantry(int level, String skill, int skillboost, int attackboost, int attack, int defense,
                    int health) {
        super(level, skill, skillboost, attackboost, attack, defense, health);

        this.level = 1;
        this.skill = "Katana Slash";
        this.attackboost = 40;
        this.skillboost = 20;
        this.attack = 40;
        this.defense = 20;
        this.health = 40;
        this.Attack_Hero = hero.Catapult_Attack;

    }

}

