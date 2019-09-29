package com.company

import org.junit.Assert

class CustomerScreenerTest extends GroovyTestCase {
    void testGetCustomersToInviteAll() {
        CustomerScreener customerScreener = new CustomerScreener(Double.MAX_VALUE)
        Assert.assertTrue("List should contain 32 customers", customerScreener.getCustomersToInvite().size() == 32)
    }

    void testGetCustomersToInviteNone() {
        CustomerScreener customerScreener = new CustomerScreener(0)
        Assert.assertTrue("List should contain 0 customers", customerScreener.getCustomersToInvite().size() == 0)
    }


    void testGetCustomersToInvite50km() {
        CustomerScreener customerScreener = new CustomerScreener(50)
        Assert.assertTrue("List should contain 8 customers", customerScreener.getCustomersToInvite().size() == 8)
    }

    void testGetCustomersToInvite200km() {
        CustomerScreener customerScreener = new CustomerScreener(200)
        Assert.assertTrue("List should contain 25 customers", customerScreener.getCustomersToInvite().size() == 25)
    }

    void testGetCustomersToInviteNegative() {
        CustomerScreener customerScreener = new CustomerScreener(-10)
        Assert.assertTrue("List should contain 0 customers", customerScreener.getCustomersToInvite().size() == 0)
    }
}
