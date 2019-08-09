package com.jeremy.springDB.Vo;

import org.springframework.stereotype.Component;

/**
 * Project: springDB
 * Package: com.jeremy.springDB.Vo
 * <p>
 * User: jeremytouch
 * Date: 8/6/19
 * Time: 10:40 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Component

public class Member {

    private String firstName;
    private String lastName;
    private String middleName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


}
