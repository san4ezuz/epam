package com.company.seaBattle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class provides logic to a Player for the game
 */
public class Player {
    private int x, y;
    private String shoot;
    private static Pattern pattern = Pattern.compile("^[a-j]10|[a-j][0-9]$");

    public static boolean validate(String s) {
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public void getShoot() {
        System.out.println("Enter coordinates of shoot. Example: d5");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            shoot = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (validate(shoot) == false) {
            System.out.println("Please enter correct coordinates. Example: a10");
            try {
                shoot = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (shoot.length() == 3)
            x = 9;
        else
            x = Character.getNumericValue(shoot.charAt(1)) - 1;
        y = (int) shoot.charAt(0) - 97;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
