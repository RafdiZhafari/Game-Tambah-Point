import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Point1 extends Actor
{
    /**
     * Act - do whatever the Point1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        setLocation(x,y+1);
        
        if(getY()==499){
            setLocation(getX(),0);
        }
        
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }    
}
