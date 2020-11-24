import java.util.*;

public class MultiTheard {
    public static void main(String[] args){
        RandomNo r=new RandomNo();
        r.start();
    }
}
class RandomNo extends Thread{
    @Override
    public void run(){
        Random r1 = new Random();
        for (int i=0;i<50;i++){
            int r2= r1.nextInt(100);
                        if((r2%2) == 0)
                        {
				square s1 = new square(r2);
				s1.start();
			}
			else 
                        {
				cube c1= new cube(r2);
				c1.start();
			}
			try 
                        {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
                        {
				System.out.println(e);
			}
		}
	}
 }
        
    
         
        
class square extends Thread{
    int n;
	square(int r3)
        {
		n=r3;
	}
    @Override
	public void run()
        {
		System.out.println("Square of "+n+"="+(n*n));
	}
}
class cube extends Thread{
    int n;
	cube(int r3)
        {
		n=r3;
	}
    @Override
	public void run() 
        {
		System.out.println("Cube of "+n+"="+(n*n*n));
	}
}
