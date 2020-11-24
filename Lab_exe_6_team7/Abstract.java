
import java.util.*;


public class Abstract {

    
    public static void main(String[] args) {
        
        studentt obj1=new studentt();
       obj1.getData();
        obj1.display();
        obj1.displaymark();
     
       faculty obj2=new faculty();
       obj2.getData();
       obj2.display();
       obj2.displaysalarydetails();
    }
}
abstract class person
{
     String name;
    int AadharNo;
    abstract void getData();
    abstract void display();
}
class studentt extends person
{
    int m1,m2,m3;
    String status;
    
    
    @Override
     void getData()
    {
        Scanner obj=new Scanner(System.in);
       System.out.println("Enter Student Name:");
       name=obj.next();
      System.out.println("Enter student Aadhar Number:");
       AadharNo=obj.nextInt();
       System.out.println("Enter the marks of three subjects:");
       m1=obj.nextInt();
       m2=obj.nextInt();
       m3=obj.nextInt();
    }
    @Override
    void display()
    {
        System.out.println("___________________________________");
         System.out.println("The student's details are:");
         System.out.println("Name:"+name);
         System.out.println("Aadhar Number:"+AadharNo);
         
    }
     void displaymark()
    {        
        int ave=((m1+m2+m3)/3);
        if(ave>=80)
           status="First class";
        else if((ave>=70)&&(ave<=79))
            status="second class";
         else if((ave>=50)&&(ave<=69))
               status="third class";
        else
             status="Fail";
        
       System.out.println("The student's mark details are:");
        System.out.println("Chemistry :"+m1);
        System.out.println("Maths :"+m2);
        System.out.println("Physics :"+m3);
        System.out.println("The average mark of the student:"+(m1+m2+m3)/3);
        System.out.println("The total mark of the student:"+(m1+m2+m3));
        System.out.println("The status of the student:"+status);
         System.out.println("______________________________________");
        
    }
    
}
class faculty extends person
{
    int id;
    String dept;
    double salary;
    double da , hra ,pf, gp =0.00, np=0.00;
    @Override
    void getData()
    {
        Scanner obj=new Scanner(System.in);
       System.out.println("Enter faculty Aname:");
       name=obj.next();
       System.out.println("Enter faculty Aadhar Number:");
       AadharNo=obj.nextInt(); 
       System.out.println("Enter faculty Salary:");
       salary=obj.nextDouble(); 
       
    }
    @Override
    void display()
    {
         System.out.println("_____________________________________");
        System.out.println("The faculty's details are:");
        
         System.out.println("Name:"+name);
         System.out.println("Aadharno:"+AadharNo);
    }
   
    public void displaysalarydetails()
    {
        Scanner obj=new Scanner(System.in);
         
       System.out.println("Salary detail's of the faculty:");
        
         da = 0.30*salary;
        hra=salary*10;
        pf=0.10*salary;
        gp = salary+ da+hra;
        np = gp - pf;
        System.out.println(" Name of the faculty :"+name);
        System.out.println("Basic salary : "+salary);
        System.out.println("Gross salary :"+ gp);
        System.out.println(" Net salary "+np);
       System.out.println("______________________________________");
    }
 }
