/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.lombokequals;

import java.util.ArrayList;
import java.util.Objects;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Helge Waastad <helge.waastad@datametrix.no>
 */
public class EqualityTest {

    public EqualityTest() {
    }

    @Test
    public void testEqualityGroupUser() {
        Customer c1 = new Customer("ert");
        Customer c2 = new Customer("tre");
        assertFalse(Objects.equals(c1, c2));

        UserGroup g1 = new UserGroup("name");
        UserGroup g2 = new UserGroup("name");
        assertTrue(Objects.equals(g2, g1));
        g1.setCustomer(c1);
        c1.getUserGroups().add(g1);
        g2.setCustomer(c2);
        c2.getUserGroups().add(g2);
        assertFalse(Objects.equals(g2, g1));

    }

}
