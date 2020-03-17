import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
public class Score extends Actor
{
    public static int score;
    World my = getWorld();
    //Waktu time = new Waktu();
    public void act() 
    {
        // Add your action code here.
        update();
        if(score==-1){
           new Backround().selesai(); 
           my.addObject(new GameOver(), my.getWidth()/2, my .getHeight()/2);
        }
        
    }
    public Score() 
    {
        
        setImage(new GreenfootImage("Score: "+score,18,Color.BLACK,Color.GREEN));
        
    }
    public void addScore(int pn)
    {
        pn = pn;
        score = score + pn;
    }
    public int getScore()
    {
        return score;
    }
    
    public void update()
    {
        setImage(new GreenfootImage("Score: "+score,18,Color.BLACK,Color.GREEN));
    }
    
}