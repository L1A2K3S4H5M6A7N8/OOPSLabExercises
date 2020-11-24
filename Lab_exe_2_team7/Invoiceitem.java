                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     

package Lab_exe_2;
import java.util.Scanner;


public class Invoiceitem {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        invoiceitem1 i1=new invoiceitem1 ("Number-1","Firstquality",10,250);
        System.out.println(i1.getid());
         System.out.println(i1.getdesc());
         System.out.println(i1.getqty());
         i1.setqty(100);
        System.out.println(i1.getunitprice());
        i1.setunitprice(1000);
         System.out.println(i1.gettotal());
         System.out.println(i1);
        
         
        invoiceitem1 i2=new invoiceitem1 ("Number-2","Secondquality",10,250);
        System.out.println(i2.getid());
         System.out.println(i2.getdesc());
         System.out.println(i2.getqty());
         i1.setqty(200);
        System.out.println(i2.getunitprice());
        i1.setunitprice(20);
         System.out.println(i2.gettotal());
         System.out.println(i2);
    }
    
}
class invoiceitem1{
    String id;
    String desc;
    int qty;
    double unitprice;
    invoiceitem1(String i,String d,int q,double u)
    {
        id=i;
        desc=d; 
        qty=q;
        unitprice=u;
    }
    String getid()
    {
        return id;
    }
    String getdesc()
    {
        return desc;
    }
    int getqty()
    {
        return qty;
    }
    void setqty(int q1)
    {
        qty=q1;
    }
    double getunitprice()
    {
        return unitprice;
    }
    void setunitprice(double u1)
    {
        unitprice=u1;
    }
    double gettotal()
    {
        return unitprice*qty;
    }
    public String tostring()
    {
        return "\nID"+id+"Description"+desc+"Quantity"+qty+"Unitprice"+unitprice;
    }
}

    
