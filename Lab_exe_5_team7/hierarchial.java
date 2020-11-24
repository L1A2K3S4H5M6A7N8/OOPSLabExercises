package lab_exe_5;

import java.util.Scanner;


public class hierarchial {

    
    public static void main(String[] args) {
        
       student1 obj=new student1();
        staff obj1=new staff();
         
        obj.getStudent1Details();
        obj.show1();
        obj1.getStaffDetails();
        obj1.show2();
              
       
        
    }
    
}
class book
{
    String name;
    int acc_no;
    String a;
    Scanner obj=new Scanner(System.in);
    public void getBookDetails()
    {
        System.out.println("Enter the book name:");
        name=obj.next();
        System.out.println("Enter the access no:");
        acc_no=obj.nextInt();
        System.out.println("Enter the author name:");
        a=obj.next();
    }
    public void show()
    {
        System.out.println("*BOOK DETAILS*");
         System.out.println("Name of the book:"+name);
          System.out.println("Access no of the book:"+accno);
           System.out.println("Author name:"+a);
         
    }
}
class student1 extends book
{
    String name;
    String rollno;
    String dept;
    public void getStudent1Details()
    {
        super.getbookdetails();
        System.out.println("Enter the student name:");
        name=obj.next();
        System.out.println("Enter the student Roll No:");
         rollno=obj.next();
         System.out.println("Enter the student deplartment:");
         dept=obj.next();
    }
    public void show1()
    {
        super.show();
           System.out.println("*STUDENT DETAILS*");
         System.out.println("Name of the student:"+name);
          System.out.println("Roll no of the student"+rollno);
           System.out.println("Department of the student:"+dept);
    }
}
class staff extends book
{
    String name;
    String sid;
    String dept;
    public void getStaffDetails()
    {
        super.getbookdetails();
        System.out.println("Enter the staff name:");
        name=obj.next();
        System.out.println("Enter the staff ID:");
         sid=obj.next();
         System.out.println("Enter the staff department:");
         dept=obj.next();
    }
        public void show2()
        {
            super.show();
        System.out.println("*STAFF DETAILS*");
         System.out.println("Name of the staff:"+name);
          System.out.println("ID of the staff:"+sid);
           System.out.println("Department of the staff:"+dept);
        }
            
              
}