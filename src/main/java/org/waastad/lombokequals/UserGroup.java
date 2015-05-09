/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.lombokequals;

import lombok.EqualsAndHashCode;

/**
 *
 * @author Helge Waastad <helge.waastad@datametrix.no>
 */
@EqualsAndHashCode(callSuper = false, of = {"name", "customer"})
public class UserGroup extends BaseIdEntity {

    private String name;
    private Customer customer;

    public UserGroup() {
    }

    public UserGroup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
