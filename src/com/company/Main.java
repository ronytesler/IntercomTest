package com.company;

import com.company.Models.Customer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CustomerScreener customerScreener = new CustomerScreener(100);
        ArrayList<Customer> invitedCustomers = customerScreener.getCustomersToInvite();
        if (invitedCustomers == null || invitedCustomers.size() == 0)
        {
            System.out.println("No customers found in 100km radius");
            return;
        }
        for (int i = 0; i < invitedCustomers.size(); i++)
        {
            Customer customer = invitedCustomers.get(i);
            System.out.println("user_id: " + customer.getUserId() + " name: " + customer.getName());
        }
    }
}
