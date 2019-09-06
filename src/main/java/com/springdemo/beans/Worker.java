package com.springdemo.beans;

import java.io.Serializable;

public class Worker implements Serializable {

    private Tool tool;
    private String profession;
    private int age;

    public Worker() {
    }

    public Worker(String profession, int age) {
        this.profession = profession;
        this.age = age;
    }

    public Worker(Tool tool) {
        System.out.println("Invocked Dependency Injection through constructor!!");
        this.tool = tool;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        System.out.println("Invocked Dependency Injection through setter!!!");
        this.tool = tool;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "profession='" + profession + '\'' +
                ", age=" + age +
                '}';
    }
}
