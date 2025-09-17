import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        if(rev(s).equals(s)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }

    public static String rev(String str){
        String a="";
        for(int i=str.length()-1;i>=0;i--){
            a+=str.charAt(i);
        }
        return a;
    }

}
