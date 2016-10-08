/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2130f16asn1_roberts_price;

/**
 *
 * @author Sean
 */
public class Dylan_Sean_FrequentFlyer extends Dylan_Sean_Passenger {
//  Initialize variables. 
    private int flyerMiles;
    private int flyerNumber;
 
/*
**********
    Constructors
**********
*/

//  Empty 
    public Dylan_Sean_FrequentFlyer(){   
    }
 
// Full 
    public Dylan_Sean_FrequentFlyer(int flyMiles, int flyNum, String fName, String lName, int pAge){
        super(fName, lName, pAge);
        flyerMiles = flyMiles;
        flyerNumber = flyNum;
    }
    
/*
**********
    Get and Set 
**********    
*/

// Flyer Miles
    public void setFMiles(int mi){
        flyerMiles = mi;
    }
    
    public int getFMiles(){
        return flyerMiles;
    }
//Flyer Number
    public void setFNumber(int num){
        flyerNumber = num;
    }

    public int getFNumber(){
        return flyerNumber;
    }

/*
**********
    Methods
**********
*/

//  toString
    @Override
    public String toString(){
        return super.toString() +"\nFrequent Flyer Number: "+ flyerNumber+
                                 "\nFrequent Flyer Miles: "+ flyerMiles+" miles";
    }
    
//  Validate Flyer Number - MOVE TO MAIN
//  While condition temporarily turns the int into a string so I can use the string length method.
    public int getValidFlyerNumber(){
        int result;
        result = input.nextInt();
        while (String.valueOf(result).length() != 10){
            System.out.println("\nThat is incorrect. Please enter your 10-digit Frequent Flyer Number.");
            result = input.nextInt();
        }
        return result;
    }

//  Validate Flyer Miles - MOVE TO MAIN
    public int getValidFlyerMiles(){
        int result;
        result = input.nextInt();
        while (result < 1){
            System.out.println("\nThat is incorrect. Please enter a valid amount of miles.");
            result = input.nextInt();
        }
        return result;
    }

}
