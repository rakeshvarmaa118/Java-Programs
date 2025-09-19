import java.util.Scanner;

public class SecondLargestNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
         int largest=Integer.MIN_VALUE;
         int secondLargest=Integer.MIN_VALUE;
        for( int value:arr){
            if (value>largest) {
                secondLargest=largest;
                largest=value;
            }else if(value>secondLargest && value!=largest){
                secondLargest=value;
            }
        }
        System.out.println("Second Largest: "+secondLargest);
        sc.close();
    }
}
