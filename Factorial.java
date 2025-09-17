import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a=sc.nextInt();
        int fact=1;
        for(int i=2; i<=a;i++){
            fact*=i;
        }
        System.out.println(fact);
        sc.close();
    }
}
