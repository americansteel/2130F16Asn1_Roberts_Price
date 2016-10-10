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

/**
 *
 * @author Dylan
 * @author Sean
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String flightNumber;
        String flightSource;
        String flightDestination;
        String travelDate;
        double flightFare;
        Dylan_Sean_Flight flight;
        //Build main object and run methods to build Flight object
        Main thisObj = new Main();
        flightNumber = thisObj.validateFlightNumber();
        flightSource = thisObj.validateFlightSource();
        flightDestination = thisObj.validateFlightDestination();
        flightFare = thisObj.validateFlightFare();
        //Not doing anything right now
        travelDate = thisObj.validateFlightDate();

        flight = new Dylan_Sean_Flight(flightNumber, flightSource, flightDestination, travelDate, flightFare);
        System.out.println(flight.toString());

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
    //This doesnt do anything right now
    public String validateFlightDate() {
        Scanner input = new Scanner(System.in);
        String date;
        boolean loop = false;
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        df.setLenient(false);
        System.out.println("Please enter a date (dd-MM-yyyy): ");
        date = input.nextLine();
        while (loop = false) {
            try {
                df.parse(date.trim());
            } catch (Exception e) {
                loop = false;
                System.out.println("Please enter a valid date");
            }

        }
        return date;
    }
}
