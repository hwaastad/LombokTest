/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.lombokequals;

import java.util.ArrayList;
import java.util.Collection;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Helge Waastad <helge.waastad@datametrix.no>
 */
@EqualsAndHashCode(callSuper = false, of = {"id"})
public class Customer extends BaseEntity {

    private String id;
    private String name;

    private Collection<UserGroup> userGroups;

    public Customer() {
    }

    public Customer(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Collection<UserGroup> getUserGroups() {
        if (userGroups == null) {
            userGroups = new ArrayList<>();
        }
        return userGroups;
    }

    public void setUserGroups(Collection<UserGroup> userGroups) {
        this.userGroups = userGroups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
