//By Kevin O'Mara

import java.util.Scanner;
import java.lang.Math;

public class InterestCalc2{
   public static void main(String []args){
      Scanner input = new Scanner(System.in);
      
      double p = 0; double t = 0; double n = 0;
      double r = 0; double amount = 0; double interestamt = 0;
      
      String select;
      
      System.out.println("What are you trying to solve for? \nEnter v for value with interest. \nEnter p for principal. \nEnter t for time. \nEnter r for interest rate. ");
      select = input.next();
      
      if(select.equals("v")){
         
         System.out.print("Enter principal: ");
         p = input.nextDouble();
         
         System.out.print("Enter number of years: ");
         t = input.nextDouble();
         
         System.out.print("Enter number of times compounded: ");
         n = input.nextDouble();
         
         System.out.print("Enter interest rate: ");
         r = input.nextDouble();
         
         amount = p * Math.pow(1 + (r / n), n * t);
         interestamt = amount - p;
         System.out.println("Amount of interest accrued is: " + interestamt);
         System.out.print("Total amount after " + t + " years is: " + amount);  
      }
      
      else if(select.equals("p")){
         System.out.print("Enter total amount(principal + acrued interest): ");
         amount = input.nextInt();
         
         System.out.print("Enter number of years: ");
         t = input.nextInt();
         
         System.out.print("Enter number of times compounded: ");
         n = input.nextInt();
         
         System.out.print("Enter interest rate: ");
         r = input.nextDouble();
         
         p = amount / Math.pow(1 + (r / n), n * t);
         
         System.out.print("Principal amount: " + p);
      }
      
      else if(select.equals("t")){
      
         System.out.print("Enter principal amount:");
         p = input.nextDouble();
      
         System.out.print("Enter total amount(principal + acrued interest): ");
         amount = input.nextInt();
         
         System.out.print("Enter number of times compounded: ");
         n = input.nextInt();
         
         System.out.print("Enter interest rate: ");
         r = input.nextDouble();

         t = Math.log((amount / p)/ (n * (Math.log(1 +(r / n)))));
         
         System.out.print("Number of years interest accumulated:" + t);
      }
      
      else if(select.equals("r")){
      
         System.out.print("Enter principal amount:");
         p = input.nextDouble();
      
         System.out.print("Enter total amount(principal + acrued interest): ");
         amount = input.nextInt();
         
         System.out.print("Enter number of years: ");
         t = input.nextInt();
         
         System.out.print("Enter number of times compounded: ");
         n = input.nextInt();
         
         r = n * (Math.pow(amount / p, 1 /( n * t))- 1);
         
         r = r * 100;
         
         System.out.print("The interest rate is: " + r);
      }
      else{
         System.out.print("Please select an option shown above.");
      }
      
   }
   
 
}