package katas;

import java.util.Comparator;

class Cat implements Comparable<Cat> {
    public String name;
    public double weight;

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat c) {
        return this.name.compareTo(c.name);
    }

    @Override
    public boolean equals(Object c) {
        return this.getClass().equals(c.getClass());
    }
}

public class CatWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        if (cat1.weight == cat2.weight) {
            return 0;
        }

        return cat1.weight > cat2.weight ? 1 : -1;
    }
}
