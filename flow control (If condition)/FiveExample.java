/* Que.5 A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
      Ask user for their salary and year of service and print the net bonus amount.
*/

import java.util.Scanner;

public class FiveExample{

public static void main(String args[]){
    double c;
    double a; double b;
    try (Scanner in = new Scanner(System.in)) {
        System.out.println("Input the monthly salary");
        a=in.nextInt();
        System.out.println("Give your serving years");
        b=in.nextInt();
    }
    c = (5/100)*a;

    if (b>5 || b==5){
        System.out.println("Here's your bonus: " +c);
    }
    else{
        System.out.println("Your bonus access is denied");
    }
}
}