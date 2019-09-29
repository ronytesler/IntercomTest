package com.company.Repositories;

import com.company.Models.Customer;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

public class CustomersNetworkFileRepository implements Iterable<Customer> {

    final String fileUrl = "https://s3.amazonaws.com/intercom-take-home-test/customers.txt";
    BufferedReader read;
    Customer nextCustomer;

    public CustomersNetworkFileRepository()
    {
        URL url;
        try {
            url = new URL(fileUrl);
            read = new BufferedReader(new InputStreamReader(url.openStream()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Iterator<Customer> iterator() {
        return new Iterator<Customer>() {
            @Override
            public boolean hasNext() {
                if (read == null)
                    return false;
                if (nextCustomer != null)
                    return true;
                try {
                    String nextLine = read.readLine();
                    Gson gson = new Gson();
                    nextCustomer = gson.fromJson(nextLine, Customer.class);
                } catch (IOException e) {
                    e.printStackTrace();
                    return false;
                }
                return nextCustomer != null;
            }

            @Override
            public Customer next() {
                Customer ret = nextCustomer;
                nextCustomer = null;
                return ret;
            }
        };
    }
}
