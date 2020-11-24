

package lab_exe_2;
import java.util.Scanner;

class Stud{

    
    int m1,m2,m3,m4,m5;
    int gp;
    String stat;
    String letter_grade;
   
    void getmarks()
    {
     
       Scanner obj=new Scanner(System.in);
      System.out.println("Enter Mark-1");
       m1=obj.nextInt();
        System.out.println("Enter Mark-2");
       m2=obj.nextInt();
        System.out.println("Enter Mark-3");
       m3=obj.nextInt();
        System.out.println("Enter Mark-4");
       m4=obj.nextInt();
         System.out.println("Enter Mark-5");
        m5=obj.nextInt();
    }
    void caltotal()
    {
      double ave=((m1+m2+m3+m4+m5)/5);
        if((ave<=100)&&(ave>=91)){
              stat="Outstanding";
               gp=10;
                letter_grade="O";
      }         

     
       else if((ave<=90)&&(ave>=81))
       {
           stat="Excellent";
           gp=9;
           letter_grade="A+";
       } 
       else if(ave<=80&&ave>=71)
       {
           stat="VeryGood";
           gp=8;
           letter_grade="A";
       }  
       else if(ave<=70&&ave>=61)
       {
           stat="Good";
           gp=7;
           letter_grade="B+";
       }  
       else if((ave<=60)&&(ave>=51))
              {   
           stat="Average";
           gp=6;
           letter_grade="B";
               }  
       else if(ave<50)
               {
               stat="Fail";
               gp=0;
               letter_grade="RA";
               }
       
    }
    void displaygrade()
    {
       
         System.out.println("The student's marks are:");
         System.out.println("Mark-1:"+m1);
         System.out.println("Mark-2:"+m2);
         System.out.println("Mark-3:"+m3);
          System.out.println("Mark-4:"+m4);
         System.out.println("Mark-5:"+m5);
         System.out.println("Total mark of the student:"+(m1+m2+m3+m4+m5));
        System.out.println("average mark of the student:"+(m1+m2+m3+m4+m5)/5);
     
          System.out.println("Status:"+stat);
          System.out.println("Grade points:"+gp);
          System.out.println("Letter Grade:"+letter_grade);
         
       
        
       
    }
        
}

public class Student {
    public static void main(String[] args){
       
      Stud obj=new Stud();
    
         
         obj.getmarks();
         obj.caltotal();
         obj.displaygrade();
     }
        
    }
    

