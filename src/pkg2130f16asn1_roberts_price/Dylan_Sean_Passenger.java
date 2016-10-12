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
**/
public class Dylan_Sean_Passenger {

// Initialize variables. 
    java.util.Scanner input = new Scanner(System.in);
    protected String firstName;
    protected String lastName;
    protected int passengerAge;
 
/*
***********
    Constructors
***********
*/
    
// Default constructor    
    public Dylan_Sean_Passenger(){
        firstName=lastName="";
        passengerAge=0;
    }
    
// Full
    public Dylan_Sean_Passenger(String fName, String lName, int pAge){
        firstName = fName;
        lastName = lName;
        passengerAge = pAge;
    }
    
/*
***********
    Get and Set 
***********
*/
    
//  First Name
    public String getFName(){
        return firstName;
    }
    
    public void setFName(String fName){
        firstName = fName;
    }
//  Last Name
    public String getLName(){
        return lastName;
    }
    
    public void setLName(String lName){
        lastName = lName;
    }
//  Passenger Age
    public int getAge(){
        return passengerAge;
    }
    
    public void setAge(int age){
        passengerAge = age;
    }
    
/*
***********
    Methods
***********
*/
    
//  toString
    @Override
    public String toString(){
        return "\nName: "+ firstName + " " + lastName+
                "\nAge: " + passengerAge;
    }
}
