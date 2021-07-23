package com.example.uasmoop;

public class archer extends hero{


    public archer(int level, String skill, int skillboost, int attackboost, int attack, int defense,
                  int health) {
        super(level, skill, skillboost, attackboost, attack, defense, health);
        // TODO Auto-generated constructor stub

        this.level = 1;
        this.skill = "Arrow Wind";
        this.attackboost = 40;
        this.skillboost = 20;
        this.attack = 40;
        this.defense = 20;
        this.health = 40;
        this.Attack_Hero = hero.Archer_Attack;
    }


}