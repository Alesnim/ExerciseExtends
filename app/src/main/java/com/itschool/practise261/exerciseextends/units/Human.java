package com.itschool.practise261.exerciseextends.units;

import com.itschool.practise261.exerciseextends.R;

public class Human extends Unit {
    int modificators =1;


    public Human(int health, int attack, String name, int modificators){
        this.name = name;
        this.attack = damage(attack);
        this.health = health;
        this.modificators = modificators;
        imageName = String.valueOf(R.drawable.mun);

    }

    private int damage(int attack) {
        return damage() + attack;
    }

    @Override
    public int damage() {
        return 24*modificators;
    }
}
