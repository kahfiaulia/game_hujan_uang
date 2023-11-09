import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lantai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lantai extends Actor
{
    public lantai()
    {    
        GreenfootImage image = getImage();  
        image.scale(1000, 50);
        setImage(image);
    }
    
    /**
     * Act - do whatever the lantai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Actor uang = getOneIntersectingObject(hudUang.class);
    MyWorld myWorld = (MyWorld)getWorld();
    if (uang!=null){
        myWorld.removeObject(uang);
    }
    
    Actor bom = getOneIntersectingObject(hudBom.class);
    if (bom!=null){
        myWorld.removeObject(bom);
    }
    
    Actor medkit = getOneIntersectingObject(hudMedkit.class);
    if (medkit!=null){
        myWorld.removeObject(medkit);
    }
    }    
}
