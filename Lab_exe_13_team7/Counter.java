import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Counter extends Applet implements Runnable{
 int counter;
 Thread t;
 
 @Override
 public void init(){
 
 counter = 0;
 t = new Thread(this);
 t.start();
 }
 
 @Override
 public void run(){
 
 try{
 
 while(true){
 repaint();
 Thread.sleep(1000);
 ++counter;
 }
 }
 catch(InterruptedException e){
 }
 }
 
    
    @Override
 public void paint(Graphics g)
 {
      setSize(600,400);
      
     g.drawOval(200,150,200,100);
     g.setFont(new Font("Algerian",Font.BOLD,30));
 FontMetrics fm = g.getFontMetrics();
 String s = "" + counter;
 Dimension d = getSize();
 int x = d.width/2 - fm.stringWidth(s)/2;
 int y = d.height/2;
 g.drawString(s,x,y);
 }
}
