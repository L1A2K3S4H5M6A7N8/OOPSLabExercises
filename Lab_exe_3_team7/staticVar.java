

package Lab_exe_3;


public class static_var {
    public static void main(String[] arg){
        program obj=new program();
        System.out.println("Sample:1");
                 obj.pro();
          program obj1=new program();
           System.out.println("Sample:2");
          obj1.pro();
          
              program obj2=new program();
               System.out.println("Sample:3");
              obj2.pro();
    }
    }
    class program
    {
        static int a=40;//static variable
        int b=20;//normal variable
        void pro()
        {
            a=a*50;
            b=b*50;
            System.out.println(a);        
            System.out.println(b); 
        }
    }
  
    

