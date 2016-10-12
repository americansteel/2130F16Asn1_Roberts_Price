/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2130f16asn1_roberts_price;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Dylan
 */
public class Dylan_Sean_Flight {

    private String flightNumber;
    private String flightSource;
    private String flightDestination;
    private String travelDate;
    private double flightFare;
    private final double TAX = 0.13;
    private double subtotal;
    private String strSubtotal;
    private double total;
    private String strTotal;
    private String logo;

//Default Constructor
    public Dylan_Sean_Flight() {

        flightNumber = "";
        flightSource = "";
        flightDestination = "";
        //Format needs to be determined
        travelDate = "";
        flightFare = 0;
    }    
//Constructor with all 5 arguments 

    public Dylan_Sean_Flight(String number, String source, String destination, String date, double fare) {
        flightNumber = number;
        flightSource = source;
        flightDestination = destination;
        travelDate = date;
        flightFare = fare;
        subtotal = fare * TAX;
        total = subtotal + fare;
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        strSubtotal = cf.format(subtotal);
        strTotal = cf.format(total);
    }
//Method for getting flight number

    public String getFlightNumber() {
        return flightNumber;
    }
//Set flight number

    public void setFlightNumber(String number) {
        flightNumber = number;
    }
//Method for getting flight source

    public String getFlightSource() {
        return flightSource;
    }
//Set flight source

    public void setFlightSource(String source) {
        flightSource = source;
    }
//Method for getting flight destination

    public String getFlightDestination() {
        return flightDestination;
    }
//Set travel destination 

    public void setFlightDestination(String destination) {
        flightDestination = destination;
    }
//Get travel date

    public String getTravelDate() {
        return travelDate;
    }
//Set travel date

    public void setTravelDate(String date) {
        travelDate = date;
    }
//Get flight price

    public double getFlightFare() {
        return flightFare;
    }
//Set flight price

    public void setFlightFare(double fare) {
        flightFare = fare;
    }
    
    @Override
    public String toString() {
        return "Flight Number: " + flightNumber + "\nFlight Source: " + flightSource
                + "\nFlight Destination: " + flightDestination + "\nTravel Date: " + travelDate
                + "\nPrice of Flight - Subotal: " + flightFare + "\n Tax: " + strSubtotal +
                "\nTotal Price: " + strTotal;
                
        
    }
}
