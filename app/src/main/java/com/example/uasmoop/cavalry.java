package com.example.uasmoop;


public class cavalry extends hero{


    public cavalry(int level, String skill, int skillboost, int attackboost, int attack, int defense,
                   int health) {
        super(level, skill, skillboost, attackboost, attack, defense, health);


        this.level = 1;
        this.skill = "Hard Kick";
        this.attackboost = 40;
        this.skillboost = 20;
        this.attack = 30;
        this.defense = 40;
        this.health = 30;
        this.Attack_Hero = hero.Archer_Attack;
    }

}
