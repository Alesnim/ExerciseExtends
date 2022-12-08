package com.itschool.practise261.exerciseextends.generics;

public class ExampleGen<T extends Integer> {

    public int add(T a, T b){
        return (int) a + (int) b;
    }
}
