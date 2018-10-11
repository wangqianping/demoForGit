package com;
/**
 * 第一个类
 * @author wangqianping
 *
 */
public class A {

    private String name;
    private String sex;
    private int age;
    private int num;
    private int num1;
    private int num2;
    private String test;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println("hello,I am A");
    }

}
