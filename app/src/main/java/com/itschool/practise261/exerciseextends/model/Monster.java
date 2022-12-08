package com.itschool.practise261.exerciseextends.model;

import android.content.Context;

import androidx.appcompat.content.res.AppCompatResources;

import com.itschool.practise261.exerciseextends.R;

public class Monster extends Unit {
    int modificators = 1;
    boolean aggressive = true;


    public Monster(int health, int attack, String name, int modificators, Context context) {
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.modificators = modificators;
        imageName = AppCompatResources.getDrawable(context, R.drawable.monster);
    }

    @Override
    public int damage() {
        return (modificators * attack);
    }
}
