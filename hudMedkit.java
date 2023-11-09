import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hudMedkit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hudMedkit extends Actor
{
    public int fallTime=0;
    private int actCount=0;
    
    public hudMedkit()
    {    
        GreenfootImage image = getImage();  
        image.scale(100, 60);
        setImage(image);
    }
    /**
     * Act - do whatever the hudUang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {      
        // Add your action code here.
        if(actCount>fallTime)
        {
            setLocation(getX(),getY()+1);
        }
        actCount++;
    }    
}
