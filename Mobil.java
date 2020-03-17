import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Mobil extends Actor
{
    /**
     * Act - do whatever the Mobil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       kendali();
       
       Point1 a= (Point1)getOneIntersectingObject(Point1.class);   //untuk point dapat hilang ketika tertabrak
        if (a!=null)
        {
            ((Backround) getWorld()).tambahNilai(1);
            Greenfoot.playSound("pop.wav");     //untuk menambahkan suara
            getWorld().removeObject(a);
            return;
        }
        
       Bomb b = (Bomb)getOneIntersectingObject(Bomb.class);
       if(b!=null)
       {
           ((Backround) getWorld()).tambahNilai(-1);
           Greenfoot.playSound("crash.wav");
           getWorld().removeObject(b);
           return;
       }
    }  
     public void kendali() {
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 2, getY());
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 2, getY());
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() -2);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() +2);
        }
    }
}
