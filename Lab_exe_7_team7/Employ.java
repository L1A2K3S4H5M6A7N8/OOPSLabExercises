import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Employ {

   
    public static void main(String[] args) {
        
         
        emp e1=new emp("aakash",90000);
        emp e2=new emp("nirmal",80000);
        emp e3=new emp("lokesh",70000);
        emp e4=new emp("aravind",440000);
        emp e5=new emp("hari",590000);
        emp e6=new emp("gokul",30000);
        emp e7=new emp("Ismail",7865909);
        emp e8=new emp("ManiKandan",100099);
        emp e9=new emp("Santhosh",890767);
        emp e10=new emp("Daniel",10987);
        emp e11=new emp("Akram",90800);
        emp e12=new emp("Christoper",89760);
        emp e13=new emp("william",109877);
        emp e14=new emp("Jega",977710);
        emp e15=new emp("sanjay",15670);
        emp e16=new emp("Richie",14440);
         emp e17=new emp("thivagar",155360);
         emp e18=new emp("yuvaraj",90870);
        emp e19=new emp("Ajmal",674590);
       emp e20=new emp("Vivek",983425);
       
        ArrayList<emp> list=new  ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        list.add(e9);
        list.add(e10);
        list.add(e11);
         list.add(e12);
        list.add(e13);
        list.add(e14);
        list.add(e15);
        list.add(e16);
        list.add(e17);
        list.add(e18);
        list.add(e19);
         list.add(e20);
          Collections.sort(list,new salarysort());
         System.out.println(list);
         
        
    }
    
}
class emp
{
    String name;
    double salary;
    emp(String n,double s)
    {
        name=n;
        salary=s;
    }
    @Override
     public String toString()
    {
        return "\nName="+name+"\tSalary="+salary;
    }
}
class salarysort implements Comparator<emp>
{
   @Override
   public int compare(emp e1,emp e2)
   {
       
       return(int)(e1.salary-e2.salary);
   }
}
