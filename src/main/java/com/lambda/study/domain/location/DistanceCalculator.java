package com.lambda.study.domain.location;

/**
 * Created by kanadara13 on 2017-06-22.
 */
public class DistanceCalculator {


    public double calculateByKillometer(Location location){
        return calculate(location,DistanceUnit.K);
    }

    private double calculate(Location location, DistanceUnit unit) {
        double theta = location.getLon1() - location.getLon2();
        double dist = Math.sin(deg2rad(location.getLat1())) * Math.sin(deg2rad(location.getLat2())) + Math.cos(deg2rad(location.getLat1())) * Math.cos(deg2rad(location.getLat2())) * Math.cos(deg2rad(theta));

        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;

        if (DistanceUnit.K  == unit) {
            dist = dist * 1.609344;
        }
        else if(DistanceUnit.M  == unit){
            dist = dist * 1609.344;
        }
        return dist;
    }


    // This function converts decimal degrees to radians
    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    // This function converts radians to decimal degrees
    private static double rad2deg(double rad) {
        return (rad * 180 / Math.PI);
    }
}



//SELECT id,
//  ( 6371 * acos( cos( radians(37) ) * cos( radians( lat ) ) * cos( radians( lng ) - radians(127) ) + sin( radians(37) ) * sin( radians( lat ) ) ) ) AS distance
// FROM TEST_TABLE HAVING distance < 5 ORDER BY distance LIMIT 0 , 5;
