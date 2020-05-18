package com.company.human;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/5/16 21:34
 * @version: ${VERSION}
 * @modified By:
 */

import com.company.transports.Transports;
public class Person {
    private String id;
    private String p_name;
    private int p_Age;
    private String sex;
    public void driveMethod(Transports transport){
//        System.out.print(this.p_name+" ");
        transport.driveMethod();
    }

    public Person() {
    }

    public Person(String id, String p_name) {
        this.id = id;
        this.p_name = p_name;
    }

    public Person(String id, String p_name, int p_Age, String sex) {
        this.id = id;
        this.p_name = p_name;
        this.p_Age = p_Age;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public int getP_Age() {
        return p_Age;
    }

    public void setP_Age(int p_Age) {
        this.p_Age = p_Age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
