
package lab_exe_5;

import java.util.Scanner;


public class Bank_prog {

    
    public static void main(String[] args) {
        
        Scanner p=new Scanner(System.in);
        char c,t;
         Bank n;
        
        do{
        System.out.println("\nEnter the bank:");
         t=p.next().charAt(0);
        switch(t)
        {
                case 'A':
                 n=new BankA();
        System.out.println(n.getBalance());
                break;
            case 'B':
                
            n=new BankB();
        System.out.println(n.getBalance());
                break;
            case 'C':
              n=new BankC();
                    System.out.println(n.getBalance());
                break;
                 default:
                  System.out.println("Enter option from 1 to 3");
                break;
            }
        System.out.println("Do u want to conitue");
        c=p.next().charAt(0);
        }while(ch=='y'||ch=='Y');
                
  
    }
}
//super_class
class Bank
{
    int getBalance()
    {
        return 0;
    }
}

class BankA extends Bank
{
    int getBalance()
    {
        return 1000;
    }
}
class BankB extends Bank
{
    int getBalance()
    {
        return 1500;
    }
}
class BankC extends Bank
{
    int getBalance()
    {
        return 2000;
    }
}

