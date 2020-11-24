class exep
{
    void arithmetic()
    {
        try
        {
            int a=5/0;
        }
        catch( ArithmeticException e)
        {
           System.out.println(e);
            
        }
            
        
    }
    void arrayhandling()
    {
        try
        {
            int b[];
            b = new int [5];
            b[6]=7;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
    void numberhandling()
    {
        try
        {
            String str="hello";
            int num=Integer.parseInt(str);
        }
        catch(NumberFormatException e)
        {
                 System.out.println(e);   
        }
    }
    void stringhandling()
    {
        try
        {
            String str="apple";
            char ch=str.charAt(-1);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);   
        }
    }
}
public class Exception_Handling {

    
    public static void main(String[] args) {
        
        exep obj=new exep();
        obj.arithmetic();
        obj.numberhandling();
        obj.arrayhandling();
        obj.stringhandling();
        
    }
}

