/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package typecasting;

import java.util.Scanner;

public class Typecasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("please enter a number and this will ask u for values and then convert them");
        Scanner keyBoard= new Scanner (System.in);
        
        int usernumber;
        double usernumber2;
        char letter;
        String name;
        String whole;
        String decimal;
        
        
        System.out.println("Enter a whole number");
        usernumber  = keyBoard.nextInt();
        
        System.out.println("Enter a decimal number");
        usernumber2 = keyBoard.nextDouble();
        
        System.out.println("Enter a String");
        name    =  keyBoard.next();
        
        System.out.println("Enter a char");
        letter= keyBoard.next().charAt(0);
        
        System.out.println("Enter a whole number");
        whole= keyBoard.next();
        
        System.out.println("Enter a decimal");
        decimal=keyBoard.next();
        
        System.out.println("The whole number you enter is being converted to doule "+ (double) usernumber);
        
        System.out.println("The decimal number you entered is being converted to integer" + (int) usernumber2);
  
        System.out.println("The String you entered is being converted to a char" + name.charAt(0));
         
        System.out.println("The single character that you entered is casted into a string and is "+ String.valueOf(letter));
        
        System.out.println("The second number you entered is " + Integer.parseInt(whole));
        
        System.out.println("The secind decumal number you entered is " + Double.parseDouble(decimal));
        
        
    }
    
}
