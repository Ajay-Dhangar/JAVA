import java.util.Scanner;
class firstExample{
  public static void main(String[] args){
    try (Scanner s = new Scanner(System.in)) {
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
}