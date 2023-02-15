/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jldevelops.mod3inclass;

/**
 *
 * @author johnsonli
 */
public class Mod3inclass {

    public static void main(String[] args) {
       double charge1 = calculateCharges("Joe",12);
       double charge2 = calculateCharges("Mathew",2);
       double charge3 = calculateCharges("Amanda",16);
       double Total = charge1 +charge2 + charge3;
       System.out.printf("Total Charges: %.2f$", Total ) ;
    }
    public static double calculateCharges(String customer, int hours){
        double baseCharge = 2.00;
        if(hours >= 24){
            System.out.println("Hello, "+ customer + " ,you are charged 10.00$ for parking for  24 hours!\n" );
            return 10.00;
        }
        if(hours > 3 ){
            double TotalCharge = baseCharge + hours * 0.5;
            System.out.printf("Hello, " + customer + " ,you are charged %.2f$ for parking for " + hours + " hours!\n",TotalCharge);
            return TotalCharge;
        }
        else{
            System.out.println("Hello, "+ customer + " ,you are charged 2.00$ for parking for " + hours + " hours!\n" );
            return baseCharge;
        }
    }
}
