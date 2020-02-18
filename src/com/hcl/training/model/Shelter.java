package com.hcl.training.model;

import java.util.ArrayList;

public class Shelter<T> {

    private ArrayList<T> cages = new ArrayList<T>(5);
    private int counter = 0;

    public void add(T o) {
        if (counter < 5) {
            System.out.println(o + " has being added!");
            cages.add(o);
            counter ++;
        } else {
            System.out.println("Sorry " + o + " there is no space for you :'(");
        }
    }

    public T getItem(int position) {
        return cages.get(position);
    }

    public T[] getAll() {
        return (T[]) cages.toArray();
    }

    public void doSomething() {
        for (Object o: cages) {
            System.out.println(o);
        }
    }
}
