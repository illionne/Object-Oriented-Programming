import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay=0;
    public void act()
    {
        // Add your action code here.
        
        if(MyWorld.score.getValue()>=100)
            shooting();
        else
            shooting();
            
        HeroDown();
    }
    public void HeroDown()
    {
        if(isTouching(Alien.class))
        {
            MyWorld.hp.add(-1);
            removeTouching(Alien.class);
        }
        if(MyWorld.hp.getValue()==0)
        {
            MyWorld.bg.stop();
            MyWorld.bg = new GreenfootSound("hit.wav");
        }
        
        if(Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2,getY());
        }
    
        shooting();
    }    
public void shooting()
{
    delay++;
    if(delay==25)
    {
        getWorld().addObject(new Bullet(),getX(),getY());
        delay=0;
        Greenfoot.playSound("ammo.wav");
    }
    
}
}