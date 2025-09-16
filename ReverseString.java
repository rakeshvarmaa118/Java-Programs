import java.util.Scanner;
// import java.lang.String;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");  
        String a=sc.nextLine();

        // char[] s=a.toCharArray();
        // for(int i=s.length-1;i>=0;i--){
        //     System.out.print(s[i]);
        // }

        String s=new StringBuilder(a).reverse().toString();
        System.out.println("Reversed: "+s);

        // String s="";
        //  for(int i=a.length()-1; i>=0; i--){
        //     s+=a.charAt(i);
        //  }
        //  System.out.println("original: " +a);
        //  System.out.println("Reversed: "+s);

        
        sc.close();  
    }
}  
