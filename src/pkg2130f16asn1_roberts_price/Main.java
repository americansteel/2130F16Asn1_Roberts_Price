/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2130f16asn1_roberts_price;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author Dylan
 * @author Sean
 */
public class Main {

    Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String flightNumber;
        String flightSource;
        String flightDestination;
        String travelDate;
        double flightFare;
        String firstName, lastName;
        int age, flyerNumber, flyerMiles;
        
        //Declaring object names
        Dylan_Sean_Flight flight;
        Dylan_Sean_Passenger passenger;
        Dylan_Sean_FrequentFlyer frequentFlyer;
        
        //Build main object and run methods to build Flight object
        Main thisObj = new Main();
        flightNumber = thisObj.validateFlightNumber();
        flightSource = thisObj.validateFlightSource();
        flightDestination = thisObj.validateFlightDestination();
        flightFare = thisObj.validateFlightFare();
        travelDate = thisObj.validateFlightDate();
        //Methods to build passenger object
        System.out.println("Please enter your first name");
        firstName = thisObj.getValidName();
        System.out.println("Please enter your last name");
        lastName = thisObj.getValidName();
        System.out.println("Please enter your age");
        age = thisObj.getValidAge();

        flight = new Dylan_Sean_Flight(flightNumber, flightSource, flightDestination, travelDate, flightFare);

        //Checking for Frequent Flyer
        //If Frequent Flyer, run methods to build object
        System.out.println("Are you a Frequent Flyer? Y/N");
        boolean ffCheck = false;
        String ffYN = "";
        while (ffCheck == false) {
            ffYN = input.nextLine();
            ffYN = ffYN.toUpperCase();
            if (ffYN.equals("Y")) {
                ffCheck = true;
            } else if (ffYN.equals("N")) {
                ffCheck = true;
            }
        }
        
        
        if ("Y".equals(ffYN)) {
            flyerNumber = thisObj.getValidFlyerNumber();
            flyerMiles = thisObj.getValidFlyerMiles();
            frequentFlyer = new Dylan_Sean_FrequentFlyer(flyerMiles, flyerNumber, firstName, lastName, age);
            System.out.println(flight.toString());
            System.out.println(frequentFlyer.toString());
        }
        if (ffYN.equals("N")) {
            passenger = new Dylan_Sean_Passenger(firstName, lastName, age);
            System.out.println(flight.toString());
            System.out.println(passenger.toString());
        }
    }
    //Validation method for flight number

    public String validateFlightNumber() {
        String flightNum;
        System.out.println("Please enter your Flight Number");
        Scanner input = new Scanner(System.in);
        flightNum = input.nextLine();
        while (flightNum.equals("")) {
            System.out.println("Please enter a valid Flight Number");
            flightNum = input.nextLine();
        }
        return flightNum;
    }
    //Validation method for flight source

    public String validateFlightSource() {
        String flightSource;
        System.out.println("Please enter your Flight Source: ");
        Scanner input = new Scanner(System.in);
        flightSource = input.nextLine();
        while (flightSource.equals("")) {
            System.out.println("Please enter a valid location");
            flightSource = input.nextLine();
        }
        return flightSource;
    }
    //Validation method for destination

    public String validateFlightDestination() {
        String flightDestination;
        System.out.println("Please enter your Flight Destination");
        Scanner input = new Scanner(System.in);
        flightDestination = input.nextLine();
        while (flightDestination.equals("")) {
            System.out.println("Please enter a valid Flight Destination");
            flightDestination = input.nextLine();
        }
        return flightDestination;
    }

    //Validation for price
    public double validateFlightFare() {
        double flightFare;
        String fareCheck;
        System.out.println("Please enter your Flight Fare");
        Scanner input = new Scanner(System.in);
        fareCheck = input.nextLine();
        while (!fareCheck.matches("^[0-9]+(\\.[0-9]{1,2})?$")) {
            System.out.println("Please enter a valid fare");
            fareCheck = input.nextLine();
        }

        flightFare = Double.parseDouble(fareCheck);
        return flightFare;
    }

    //Validation for date
    public String validateFlightDate() {
        String date = "";
        boolean dateValid = false;
        Scanner input = new Scanner(System.in);
        while (dateValid == false) {
            while (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
                System.out.println("Please enter a date 'YYYY-MM-DD:");
                date = input.nextLine();

            }

            try {

                SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                dateformat.setLenient(false);
                Date date1 = dateformat.parse(date);
                Date today = Calendar.getInstance().getTime();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date1);
                if (date1.after(today)) {
                    dateValid = true;
                } else {
                    date = "";

                }
            } catch (ParseException ex) {
                // ex.printStackTrace();
                date = "";

            }
        }
        return date;
    }
//  name validation
    public String getValidName() {
        String result;
        result = input.nextLine();
        while (result.length() < 2) {
            System.out.println("\nThat is incorrect. Please enter a valid name.");
            result = input.nextLine();
        }
        return result;
    }

//  Age validation
    public int getValidAge() {
        int result;
        result = input.nextInt();
        while (result < 1 || result > 110) {
            System.out.println("That is incorrect. Please enter a valid age.");
            result = input.nextInt();
        }
        return result;
    }

//  Validate Flyer Number
//  While condition temporarily turns the int into a string so I can use the string length method.
    public int getValidFlyerNumber() {
        Scanner input = new Scanner(System.in);
        int result;
        System.out.println("Please enter your Frequent Flyer Number");
        result = input.nextInt();
        while (String.valueOf(result).length() != 10) {
            System.out.println("\nThat is incorrect. Please enter your 10-digit Frequent Flyer Number.");
            result = input.nextInt();
        }
        return result;
    }

//  Validate Flyer Miles
    public int getValidFlyerMiles() {
        Scanner input = new Scanner(System.in);
        int result;
        System.out.println("Please enter your total Frequent Flyer Miles");
        result = input.nextInt();
        while (result < 1) {
            System.out.println("\nThat is incorrect. Please enter a valid amount of miles.");
            result = input.nextInt();
        }
        return result;
    }
}
