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
    private int flyerMiles;
    private int flyerNumber;
    
    public Dylan_Sean_FrequentFlyer(){
        
    }
    
    public Dylan_Sean_FrequentFlyer(int flyMiles, int flyNum, String fName, String lName, int pAge){
        flyerMiles = flyMiles;
        flyerNumber = flyNum;
        firstName = fName;
        lastName = lName;
        passengerAge = pAge;
    }
    
    public void setFMiles(int mi){
        flyerMiles = mi;
    }
    
    public int getFMiles(){
        return flyerMiles;
    }
    
    public void setFNumber(int num){
        flyerNumber = num;
    }
    
    public int getFNumber(){
        return flyerNumber;
    }
    
    @Override
    public String toString(){
        return super.toString() +"\nFrequent Flyer Number: "+ flyerNumber+
                                 "\nFrequent Flyer Miles: "+ flyerMiles;
    }
}
