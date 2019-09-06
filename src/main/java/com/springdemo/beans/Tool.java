package com.springdemo.beans;

import java.io.Serializable;

public class Tool implements Serializable {

    private String name;
    private int weight;

    public Tool() {
    }

    public Tool(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
