import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.String;

public class Backround extends World
{
    Score skor = new Score ();
    Mobil kumbang = new Mobil();
    Waktu limit = new Waktu();
    //Point1 buah = new Point1();
    //Bomb bom = new Bomb();
    
    int time = 1*60*55;
    
    public void tambahNilai(int n)
    {
        skor.addScore(n);
    }
    
    public Backround()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setPaintOrder(Point1.class, Mobil.class, Bomb.class, 
        Waktu.class, PapanSkor.class, Score.class);
        try{
        addObject(new Point1(),500,-20);
        addObject(skor,100,100);
        addObject(kumbang,100,360);
        addObject(new Bomb(),500,-30);
        addObject(limit, 60,10);
    }   catch(Exception e){
        System.out.println("Ada Error : "+e);
    }
    }
    public void selesai(){
          Greenfoot.stop();
        }        
    public void act(){
        if(Greenfoot.getRandomNumber(100) < 2) {                        //untuk pie dapat random/ acak
            addObject(new Point1(), Greenfoot.getRandomNumber(700), 9);
        }
        
        if(Greenfoot.getRandomNumber(100) < 2) {                        //untuk pie dapat random/ acak
            addObject(new Bomb(), Greenfoot.getRandomNumber(700), 8);
        }
        
    }
}
