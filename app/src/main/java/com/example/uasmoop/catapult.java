package com.example.uasmoop;

public class catapult extends hero{

    public catapult(int level, String skill, int skillboost, int attackboost, int attack, int defense,
                    int health) {
        super(level, skill, skillboost, attackboost, attack, defense, health);

        this.level = 1;
        this.skill = "Meteor Rocks";
        this.attackboost = 40;
        this.skillboost = 20;
        this.attack = 50;
        this.defense = 30;
        this.health = 20;
        this.Attack_Hero = hero.Catapult_Attack;

    }

}