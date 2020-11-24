

package JavaApp;
import java.util.Scanner;


public class revenue {
    public static void main(String[] args){
        double rate=0;
        double amount=0;
        
        Scanner obj=new Scanner(System.in);
           
        System.out.println("the unit price:");
        int n=obj.nextInt();
        System.out.println("the quantity of a product:");
        double q=obj.nextDouble();
        double revenue=0.0;
        if((q>=100)&&(q<=120))
        {
            rate=10/100;
        amount=0.0;
        revenue=n*q;
        amount=revenue*0.1;
        revenue=revenue-amount;
    }
        else
        {
            rate=15/100;
            revenue=n*q;
            amount=revenue*rate;
            revenue=revenue-amount;
        }
        System.out.println("The revenue from sale:"+revenue);
        System.out.println("After discount:"+(n*q));
        
        }
           
            
        
        
        
    }
    
}
