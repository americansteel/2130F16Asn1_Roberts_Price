/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2130f16asn1_roberts_price;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class Dylan_Sean_Passenger {

// Initialize variables. Need to be public in order to be read by the subclass
    java.util.Scanner input = new Scanner(System.in);
    public String firstName;
    public String lastName;
    public int passengerAge;
 
/*****
* Constructors
******/
    
// Default constructor    
    public Dylan_Sean_Passenger(){
        firstName=lastName="";
        passengerAge=0;
    }
    
// First, Last, Age
    public Dylan_Sean_Passenger(String fName, String lName, int pAge){
        firstName = fName;
        lastName = lName;
        passengerAge = pAge;
    }
// First, Last 
    public Dylan_Sean_Passenger(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }
// First Only   
    public Dylan_Sean_Passenger(String fName){
        firstName = fName;
    }
    
/*****
* Get and Set for each   
******/
    public String getFName(){
        return firstName;
    }
    
    public void setFName(String fName){
        firstName = fName;
    }
    
    public String getLName(){
        return lastName;
    }
    
    public void setLName(String lName){
        lastName = lName;
    }
    
    public int getAge(){
        return passengerAge;
    }
    
    public void setAge(int age){
        passengerAge = age;
    }
    
    
}
