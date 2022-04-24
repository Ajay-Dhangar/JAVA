import java.util.Scanner;
class Ex-1.0{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter length");
    int x = s.nextInt();
    System.out.println("Enter breadth");
    int y = s.nextInt();
    if(x==y){
      System.out.println("Square");
    }
    else{
      System.out.println("Rectangle");
    }
  }
}