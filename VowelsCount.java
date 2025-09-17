import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String a=sc.nextLine();
        int count=0;
        String vowels="aeiouAEIOU";
        for(char c:a.toCharArray()){
            if(vowels.indexOf(c) !=-1){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }

    
}
