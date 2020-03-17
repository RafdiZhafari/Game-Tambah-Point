import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Waktu extends Actor
{
    public int waktu=1*60*55;
    Score skor = new Score();
    
    public void act() 
    {
        // Add your action code here.
        --waktu;
        update(); 
       if(waktu/55==0){
           int x = skor.score;
           skor.score=0;
           World myWorld = getWorld();
           
           new Backround().selesai();
                      
           myWorld.addObject(new GameOver(), myWorld.getWidth()/2, myWorld.getHeight()/2);
           myWorld.addObject(new PapanSkor(x), myWorld.getWidth()/4, myWorld.getHeight()/4);
        }
    }    
    public Waktu(){
     setImage(new GreenfootImage("Time Limit: "+waktu/55,18,Color.BLACK,Color.WHITE));  
    }
    public void update()
    {
      setImage(new GreenfootImage("Time Limit: "+waktu/55,18,Color.BLACK,Color.WHITE));
    }
}
