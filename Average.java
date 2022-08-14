//Write code so that the user is prompted for 3 assignment scores.
//        The program then calculates the average score for the 3 assignments.
//        It should display the output to a maximum of 2 decimal places.
//        Hint: you will need to use a DecimalFormat or NumberFormat for the decimal places
//
//        For example:
//
//        Input	Result
//        22 95 78
//        Assign 1 score:
//        Assign 2 score:
//        Assign 3 score:
//        Your average score is 65

import java.util.Scanner;
import java.text.DecimalFormat;
public class Average {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter three numbers");
        int assignment1=scan.nextInt();
        int assignment2=scan.nextInt();
        int assignment3=scan.nextInt();
        double averageAssignment=(double) (assignment1+assignment2+assignment3)/3;
        System.out.println("Assign 1 score:");
        System.out.println("Assign 2 score:");
        System.out.println("Assign 3 score:");
        String pattern = "#.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(averageAssignment);
        System.out.println("Your average score is "+format);

    }
}
