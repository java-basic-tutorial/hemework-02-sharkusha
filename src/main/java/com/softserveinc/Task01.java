package com.softserveinc;

/*
    Write a program that calculates the average annual temperature.
    Also, you need to find months with the lowest and highest temperature in a year.

    Month          |  I   | II   | III |  IV  |  V   |  VI  | VII  | VIII | IX   |  X   | XI  | XII
    ---------------|------|------|-----|------|------|------|------|------|------|------|-----|------
    Temperature    | -1.7 | -1,0 | 2,6 |  9,0 | 15,1 | 19,4 | 21,4 | 21,2 | 17,1 | 11,1 | 5,9 |  1,4

    The example below shows how your output might look:

    Average annual temperature: 10.125
    Month with the lowest temperature in a year: I
    The month with the highest temperatures in a year: VII
 */
public class Task01 {
    public static void main(String[] args) {
        //  I  | II | III | IV |  V  |  VI | VII | VIII | IX  |  X  | XI |  XII
        double[] temperature = {-1.7, -1.0, 2.6, 9.0, 15.1, 19.4, 21.4, 21.2, 17.1, 11.1, 5.9, 1.4};
        // TODO: Write your code here
        double sum = 0;
        for (int i = 0; i < temperature.length; i++) {
            sum = sum + temperature[i];
        }
        double average = sum / temperature.length;

        double minT = temperature[0];
        double maxT = temperature[0];
        int minMonth = 0;
        int maxMonth = 0;
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] <= minT) {
                minT = temperature[i];
                minMonth = i + 1;
            }
            if (temperature[i] >= maxT) {
                maxT = temperature[i];
                maxMonth = i + 1;
            }
        }
        String minMonthR = "";
        String maxMonthR = "";
        switch (minMonth) {
            case 1:
                minMonthR = "I";
                break;
            case 2:
                minMonthR = "II";
                break;
            case 3:
                minMonthR = "III";
                break;
            case 4:
                minMonthR = "IV";
                break;
            case 5:
                minMonthR = "V";
                break;
            case 6:
                minMonthR = "VI";
                break;
            case 7:
                minMonthR = "VII";
                break;
            case 8:
                minMonthR = "VIII";
                break;
            case 9:
                minMonthR = "IX";
                break;
            case 10:
                minMonthR = "X";
                break;
            case 11:
                minMonthR = "XI";
                break;
            case 12:
                minMonthR = "XII";
                break;
        } 
        switch (maxMonth) {
            case 1:
                maxMonthR = "I";
                break;
            case 2:
                maxMonthR = "II";
                break;
            case 3:
                maxMonthR = "III";
                break;
            case 4:
                maxMonthR = "IV";
                break;
            case 5:
                maxMonthR = "V";
                break;
            case 6:
                maxMonthR = "VI";
                break;
            case 7:
                maxMonthR = "VII";
                break;
            case 8:
                maxMonthR = "VIII";
                break;
            case 9:
                maxMonthR = "IX";
                break;
            case 10:
                maxMonthR = "X";
                break;
            case 11:
                maxMonthR = "XI";
                break;
            case 12:
                maxMonthR = "XII";
                break;
        }
        System.out.println("Average annual temperature: " + average + "\n" +
        "Month with the lowest temperature in a year:  " +minMonthR + "\n" +
                "The month with the highest temperatures in a year: " + maxMonthR);
        }
    }
