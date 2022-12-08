package com.itschool.practise261.exerciseextends.model;


import static com.itschool.practise261.exerciseextends.R.drawable.*;

import android.content.Context;

import androidx.appcompat.content.res.AppCompatResources;

import com.itschool.practise261.exerciseextends.R;

public class Skeleton extends Unit {

    int numberBone = 132;
    int modificators = 1;

    public Skeleton(int health, int attack, String name, int modificators, Context context) {
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.modificators = modificators;
        imageName = AppCompatResources.getDrawable(context, skeleton);;
    }

    @Override
    public int damage() {
        return 10 * modificators;
    }
}
