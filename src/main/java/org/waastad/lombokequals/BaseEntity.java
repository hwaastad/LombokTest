/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.lombokequals;

import java.util.Date;

/**
 *
 * @author Helge Waastad <helge.waastad@datametrix.no>
 */
public abstract class BaseEntity {
    private Date created;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
