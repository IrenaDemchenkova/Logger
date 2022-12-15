package ru.IrenDemchenkova;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GregorianCalendar calendar = new GregorianCalendar();
        Logger logger = Logger.getInstance();
        logger.log("We are starting our program");
        logger.log("We ask user to input the initial data for the list");
        System.out.print("Please, input list's size: ");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.print("Please,input upper limit for values: ");
        int max = Integer.parseInt(scanner.nextLine());
        logger.log("Creating and filling in the list...");
        ArrayList<Integer> source = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            source.add(i, random.nextInt(max));
        }
        System.out.println("Here is the random list: " + source);
        logger.log("We ask user to input data for filter");
        System.out.print("Please, input threshold value for filter: ");
        int threshold = Integer.parseInt(scanner.nextLine());
        logger.log("Filter is running...");
        Filter filter = new Filter(threshold);
        List<Integer> result = filter.filterOut(source);
        logger.log("Passed the filter " + result.size() + " elements of " + size);
        logger.log("Printing out results");
        System.out.println("Filtered list: " + result);
        logger.log("Program is finished");
    }
}