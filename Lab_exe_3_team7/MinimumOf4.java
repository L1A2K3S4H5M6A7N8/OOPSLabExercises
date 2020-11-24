

package Lab_exe_3;
import java.util.Scanner;


public class MinimumOf4 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the terms");
        int a=obj.nextInt();
       int b=obj.nextInt();
       int c=obj.nextInt();
       int d=obj.nextInt();
       int e;
       e=(a<b && a<c && a<d)?a:(b<c && b<d)?b:(c<d)?c:d;//use of ternary operator
       System.out.println("The minimum number is"+e);
    }
    
}
