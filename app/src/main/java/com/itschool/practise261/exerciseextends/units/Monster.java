package com.itschool.practise261.exerciseextends.units;

import com.itschool.practise261.exerciseextends.R;

public class Monster extends Unit {
    int modificators =1;
    boolean aggressive = true;



    public Monster(int health, int attack, String name, int modificators){
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.modificators = modificators;
        imageName = String.valueOf(R.drawable.monster);
    }

    @Override
    public int damage() {
        return (modificators*attack);
    }
}
