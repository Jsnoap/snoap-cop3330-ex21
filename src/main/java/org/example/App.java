/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Program converts numbers from 1 to 12 to the corresponding month.
    // Prompt user for number and display month
    // Any value outside, display an appropriate error message
    public static void main( String[] args )
    {
        int monthNum;
        String month;

        System.out.println("Please enter the number of the month: ");
        Scanner inputMonthNum = new Scanner(System.in);
        monthNum = inputMonthNum.nextInt();

        switch (monthNum)
        {
            case 1: month = "January";
                    break;
            case 2: month = "February";
                    break;
            case 3: month = "March";
                    break;
            case 4: month = "April";
                    break;
            case 5: month = "May";
                    break;
            case 6: month = "June";
                    break;
            case 7: month = "July";
                    break;
            case 8: month = "August";
                    break;
            case 9: month = "September";
                    break;
            case 10: month = "October";
                     break;
            case 11: month = "November";
                     break;
            case 12: month = "December";
                     break;
            default: month = "N/A";
                     break;
        }
        System.out.println("The name of the month is " + month + ".");
    }
}
