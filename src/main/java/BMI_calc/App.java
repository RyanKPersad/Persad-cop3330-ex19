/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */

package BMI_calc;
import java.util.Scanner;

public class App 
{
    static Scanner myObj = new Scanner(System.in);

    public static void main( String[] args )
    {
        String weight;
        String height;

        System.out.println( "Enter weight in pounds" );
        weight= myObj.nextLine();

        System.out.println( "Enter height in inches" );
        height = myObj.nextLine();

        if(!weight.matches("[0-9.]+")|!height.matches("[0-9.]+")){
            System.out.println("You have entered a non-numeric value\nCan not Compute" );


        }else{
            double weight1 = Double.parseDouble(weight);
            double height1 = Double.parseDouble(height);

            double x = Math.pow(height1,2);
            double y = weight1/x;
            double z = y*703;


            if (z>=18.5 && z <=25){

                String print = String.format("%.2f",z);
                String print1 = String.format("Your BMI is %s.\n" +
                        "You are within the ideal weight range.",print);
                System.out.println(print1);


            }else if(z>25.5){
                String print = String.format("%.2f",z);
                String print1 = String.format("Your BMI is %s.\n" +
                        "You are Overweight you should see a doctor.",print);
                System.out.println(print1);
            }

        }



    }
}
