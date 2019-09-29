package com.company.Utils

import org.junit.Assert

class DistanceUtilsTest extends GroovyTestCase {

    private double error = 1 // allow 1km error
    private double officeLat = 53.339428
    private double officeLng = -6.257664

    void testGetSphericalDistance1() {
        double lat1 = 55.033
        double lng1 = -8.112
        double lat2 = 52.366037
        double lng2 = -8.179118
        double distance = DistanceUtils.getSphericalDistance(lat1, lng1, lat2, lng2)
        Assert.assertTrue("Wrong distance ", Math.abs(distance - 296.679) < error)
    }

    void testGetSphericalDistance2() {
        double lat1 = 51.92893
        double lng1 = -10.27699
        double lat2 = officeLat
        double lng2 = officeLng
        double distance = DistanceUtils.getSphericalDistance(lat1, lng1, lat2, lng2)
        Assert.assertTrue("Wrong distance ", Math.abs(distance - 313.354) < error)
    }

    void testGetSphericalDistance3() {
        double lat1 = 52.240382
        double lng1 = -7.915833
        double lat2 = 52.240382
        double lng2 = -7.915833
        double distance = DistanceUtils.getSphericalDistance(lat1, lng1, lat2, lng2)
        Assert.assertTrue("Wrong distance ", Math.abs(distance - 0) < error)
    }


}
