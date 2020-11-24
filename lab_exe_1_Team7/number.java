

package JavaApp;
import java.util.Scanner;


public class number {
    private static int i;
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int r=0;
        for(i=101;i<200;i++)
        {
            if(i%8==0)
            r=r+i;
        }
        System.out.println("The number is:"+r);
        
        }
    }
    

