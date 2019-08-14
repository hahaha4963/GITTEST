package com.neicunTest;

import java.io.Serializable;


public class People implements Serializable {

    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public People() {

    }

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
