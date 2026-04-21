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
    }
}
