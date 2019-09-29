package com.company;

import com.company.Models.Customer;
import com.company.Repositories.CustomersNetworkFileRepository;
import com.company.Utils.DistanceUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CustomerScreener {

    double radius;
    final double officeLat = 53.339428;
    final double officeLng = -6.257664;

    public CustomerScreener(double radiusInKms) {
        this.radius = radiusInKms;
    }

    public ArrayList<Customer> getCustomersToInvite() {
        ArrayList<Customer> customersToInvite = new ArrayList<>();
        if (radius < 0)
            return customersToInvite;
        CustomersNetworkFileRepository customersNetworkFileRepository = new CustomersNetworkFileRepository();
        Iterator<Customer> customersIterator = customersNetworkFileRepository.iterator();
        while (customersIterator.hasNext()) {
            Customer customer = customersIterator.next();
            try {
                if (DistanceUtils.getSphericalDistance(Double.valueOf(customer.getLatitude()),
                        Double.valueOf(customer.getLongitude()),
                        officeLat, officeLng) <= this.radius)
                    customersToInvite.add(customer);

            } catch (com.google.gson.JsonSyntaxException e) {
                // log
            } catch (Exception e) {
                // log
            }
        }
        Collections.sort(customersToInvite);
        return customersToInvite;
    }
}
