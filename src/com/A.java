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
    
    public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void print(){
        System.out.println("hello,I am A");
    }

    public String getTest() {
        return test;
    }
}
