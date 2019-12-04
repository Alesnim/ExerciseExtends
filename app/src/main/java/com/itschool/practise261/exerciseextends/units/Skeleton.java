package com.itschool.practise261.exerciseextends.units;


import com.itschool.practise261.exerciseextends.R;

import static com.itschool.practise261.exerciseextends.R.*;
import static com.itschool.practise261.exerciseextends.R.drawable.*;

public class Skeleton extends Unit {

    int numberBone = 132;
    int modificators =1;

    public Skeleton(int health, int attack, String name, int modificators){
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.modificators = modificators;
        imageName = String.valueOf(skeleton);
    }

    @Override
    public int damage() {
        return 10*modificators;
    }
}
