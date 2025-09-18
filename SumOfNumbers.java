import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args){
        Scanner scc=new Scanner(System.in);
        System.out.print("Enter size of list: ");
        int sz=scc.nextInt();
        int[] arr=new int[sz];
        int sum=0;
        System.out.print("Enter "+sz+" elements: ");

        
        for(int i:arr){
            arr[i]=scc.nextInt();
            sum+=arr[i];
        }


        // for(int i=0;i<sz;i++){
        //     arr[i]=scc.nextInt();
        //     sum+=arr[i];
        // }
        System.out.println(sum);
        scc.close();
    }
}
