
//Que.2 Take two int values from user and print greatest among them

import java.util.Scanner;
class SecondExample{
  public static void main(String[] args){
    try (Scanner s = new Scanner(System.in)) {
      System.out.println("Enter value of x : ");
      int x = s.nextInt();
      System.out.println("Enter value of y : ");
      int y = s.nextInt();
      if(x>y){
        System.out.println(x+" is greater");
      }
      else{
        System.out.println(y+" is greater");
      }
    }
  }
}