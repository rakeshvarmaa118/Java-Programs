import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int a=0,b=1;

        for(int i=1;i<=n;i++){
            System.out.print(a + " ");
            int next=a+b;
            a=b;
            b=next;
        }
        
        sc.close();        
    }
}
