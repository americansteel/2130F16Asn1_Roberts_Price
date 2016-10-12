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
}
