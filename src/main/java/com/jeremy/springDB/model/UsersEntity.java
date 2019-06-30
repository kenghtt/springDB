package com.jeremy.springDB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Project: springDB
 * Package: com.jeremy.springDB.model
 * <p>
 * User: jeremytouch
 * Date: 6/26/19
 * Time: 1:31 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class UsersEntity {



    @Id
    @GeneratedValue()
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "team_name")
    private String teamName;
    @Column(name = "salary")
    private int salary;

    public UsersEntity(){

    }

    public UsersEntity(int id, String name, String teamName, int salary){
        this.id = id;
        this.name = name;
        this.teamName= teamName;
        this.salary=salary;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



}
