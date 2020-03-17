import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PapanSkor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PapanSkor extends Actor
{
    /**
     * Act - do whatever the PapanSkor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PapanSkor(int skor){
     setImage(new GreenfootImage("Your Score : "+skor, 48, Color.BLACK, Color.WHITE));   
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
