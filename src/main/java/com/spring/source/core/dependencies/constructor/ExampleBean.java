package com.spring.source.core.dependencies.constructor;

import java.beans.ConstructorProperties;

/**
 * @author sunlichao
 */
public class ExampleBean {
    private String userName;
    private Integer age;
    private Integer number;


    @ConstructorProperties({"userName","age","number"})
    public ExampleBean(String userName, Integer age, Integer number) {
        // todo don't understand the @ConstructorProperties
        this.userName = userName;
        this.age = age;
        this.number = number;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", number=" + number +
                '}';
    }
}
