import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien2 extends Actor
{
    /**
     * Act - do whatever the Alien2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x=2;
    public void act()
    {
        // Add your action code here.
        setLocation(getX()+x,getY()+1);
        if(getX()>=getWorld().getWidth()-15 || getX()<=15 )
            x=-x;
            
        if(getY()==getWorld().getHeight()-15)
        setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
    }
}
