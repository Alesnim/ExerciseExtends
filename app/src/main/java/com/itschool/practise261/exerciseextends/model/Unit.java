package com.itschool.practise261.exerciseextends.model;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public abstract class Unit {

    public int health;
    public String name;
    public int attack;
    public Drawable imageName;


    public abstract int damage();
}
