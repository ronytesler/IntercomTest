package com.company.Repositories

import com.company.Models.Customer
import org.junit.Assert

class CustomersNetworkFileRepositoryTest extends GroovyTestCase {

    void testIterator() {
        CustomersNetworkFileRepository customersNetworkFileRepository = new CustomersNetworkFileRepository()
        Iterator<Customer> iterator = customersNetworkFileRepository.iterator()
        int counter = 0
        while (iterator.hasNext())
        {
            iterator.next()
            counter++
            iterator.hasNext()
            iterator.hasNext()
            iterator.hasNext()
            iterator.hasNext()
            iterator.hasNext()
            iterator.hasNext()
        }
        Assert.assertTrue("Should iterate over 32 customers ", counter == 32)
    }

    void testIteratorNotCrashing() {
        CustomersNetworkFileRepository customersNetworkFileRepository = new CustomersNetworkFileRepository()
        Iterator<Customer> iterator = customersNetworkFileRepository.iterator()
        // just to see that we're not crashing
        for (int i = 0; i < 100; i++)
        {
            iterator.next()
            iterator.hasNext()
            iterator.next()
            iterator.hasNext()
        }
    }

}
