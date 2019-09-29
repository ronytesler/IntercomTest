package com.company.Utils;

public class DistanceUtils {

    final static int earthRadiusKm = 6371;


    public static double getSphericalDistance(double lat1, double lng1, double lat2, double lng2) {
        lat1 = Math.toRadians(lat1);
        lng1 = Math.toRadians(lng1);
        lat2 = Math.toRadians(lat2);
        lng2 = Math.toRadians(lng2);

        double deltaLngAbs = Math.abs(lng2 - lng1);
        double centralAngle = Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(deltaLngAbs));
        return earthRadiusKm * centralAngle;
    }
}
