import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String a=sc.nextLine();

        //set
        int count=0;
        Set<Character> vowels=new HashSet<>();
        for(char v:"aeiouAEIOU".toCharArray()){
            vowels.add(v);
        }
        for(char c:a.toCharArray()){
            if(vowels.contains(c)){
                count++;
            }
        }


        // //IndexOf()
        // int count=0;
        // String vowels="aeiouAEIOU";
        // for(char c:a.toCharArray()){
        //     if(vowels.indexOf(c) !=-1){
        //         count++;
        //     }
        // }

        // //Regex
        // int count=a.replaceAll("(?i)[^aeiou]","").length();

        System.out.println(count);
        sc.close();
    }

    
}
