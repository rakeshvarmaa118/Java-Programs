import java.util.Scanner;

public class SumOfTwo {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=a+b;
    System.out.println(c);
    sc.close();
  }  
}
