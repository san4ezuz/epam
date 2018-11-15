package com.company.trafficLights;

import java.util.Scanner;

public class TrafficLights {

    public static void main(String[] args) {
        int minute;

        System.out.print("Input minuts: ");
        Scanner inputMinutes = new Scanner(System.in);
        minute = inputMinutes.nextInt();
        System.out.println(getColorOfTrafficLights(minute));
    }

    static private String getColorOfTrafficLights(int minute) throws IllegalArgumentException {
        int trafficLights;
        trafficLights = minute % 10;
        if(trafficLights >= 0 && trafficLights < 2) {
            return "red";
        } else if(trafficLights >= 2 && trafficLights < 5) {
            return "yellow";
        } else if(trafficLights >= 5 && trafficLights < 9){
            return "green";
        } else {
            throw new IllegalArgumentException();
        }
    }
}