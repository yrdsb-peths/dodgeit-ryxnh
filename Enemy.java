import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        move(-10); 
        
        if(getX() <= 0)
        {
            resetEnemy(); 
        }
        
        if(isTouching(Hero.class))
        {

            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200); 
            getWorld().removeObject(this); 
        }
    }
    
    public void resetEnemy()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600,100);
            
        }
        else
        {
            setLocation(600, 300); 
        }
    }
    
}
