/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */
import java.util.Scanner;
import java.util.Calendar;

public class exercise06 {
    public static void main(String[] args) {
        System.out.printf("What is your current age? ");
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();
        int newAge = Integer.parseInt(age);
        System.out.printf("At what age would you like to retire? ");
        Scanner scanner1 = new Scanner(System.in);
        String retire = scanner1.nextLine();
        int newRetire = Integer.parseInt(retire);
        int DiffAR;
        DiffAR = newRetire - newAge;
        System.out.printf("You have " + DiffAR + " years left until you can retire.");
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int NewYear;
        NewYear = DiffAR + year;
        System.out.printf("\nIt's " + year + ", so you can retire in " + NewYear);

    }
}