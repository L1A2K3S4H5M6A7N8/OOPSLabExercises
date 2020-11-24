
package package1;

import subpack.arithmetic;


public class armstrong {

    
    public static void main(String[] args) {
         arm n=new arm();
          n.show(370);
          int remainder;
          int result = 0;
          int originalnum=144;
          
        while(originalnum!=0)
        {
            remainder=  originalnum%10;
            result+=Math.pow(remainder,3);
            originalnum/=10;
            
        }
        if(result==144)
            System.out.println(n +"is an armstrong number");
        else
            System.out.println(n +"is not an armstrong number");
        
        
        
     System.out.println("\n PERFORMING ARITHMETIC OPERATIONS");
    arithmetic a=new arithmetic();
    System.out.println("\n adding two numbers");
    a.add(10,5);
     arithmetic b=new arithmetic();
    System.out.println("\n subtracting two numbers");
    b.sub(20,10);
    arithmetic c=new arithmetic();
    System.out.println("\n Multiplying two numbers");
    c.mul(5,2);
    arithmetic d=new arithmetic();
    System.out.println("\n Dividing two numbers");
    d.div(50,10);
    arithmetic e=new arithmetic();
    System.out.println("\n Modulus of two numbers");
    e.mod(15,7);
       
    }
    
}
