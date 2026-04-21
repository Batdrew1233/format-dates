package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingDates {
    public static void main(String[] args) {
        //Get current date
        LocalDate todaysDate = LocalDate.now();
        //Format the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        //Put formatted date into string
        String formattedDate = todaysDate.format(formatter);
        //Print formatted date
        System.out.println(formattedDate);

        // Made a new date formatter
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //Put the formatted date into new string variable
        String formattedDate2 = todaysDate.format(formatter2);
        //Print the second formatted date
        System.out.println(formattedDate2);

        //Made third date formatter
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE MM, yyyy");
        //Put the formatted date into new string variable
        String formattedDate3 = todaysDate.format(formatter3);
        //Print the third formatted date
        System.out.println(formattedDate3);

    }
}
