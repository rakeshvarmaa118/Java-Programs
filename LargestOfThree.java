import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three values: ");
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println("Largest Number is "+Math.max(a,Math.max(b,c)));

        // if(a>b && a>c){
        //     System.out.println("Largest Number is"+a);
        // }
        // else if (b>c) {
        //     System.out.println("Largest Number is"+b);
        // } 
        // else {
        //     System.out.println("Largest Number is"+c);
        // }

        sc.close();
    }
}
