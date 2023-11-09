import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class charActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class charActor extends Actor
{
    public charActor()
    {    
        GreenfootImage image = getImage();  
        image.scale(200, 200);
        setImage(image);
    }
    /**
     * Act - do whatever the charActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("left")){
            move(-3);
    }
    if (Greenfoot.isKeyDown("right")){
            move(3);
    }
    Actor uang = getOneIntersectingObject(hudUang.class);
    MyWorld myWorld = (MyWorld)getWorld();
    if (uang!=null){
        myWorld.removeObject(uang);
        myWorld.tambahSkor();
        Greenfoot.playSound("uang.mp3");
    }
    
    Actor bom = getOneIntersectingObject(hudBom.class);
    if (bom!=null){
        myWorld.removeObject(bom);
        myWorld.kurangNyawa();
        Greenfoot.playSound("bom.mp3");
    }
    
    Actor medkit = getOneIntersectingObject(hudMedkit.class);
    if (medkit!=null){
        myWorld.removeObject(medkit);
        myWorld.tambahNyawa();
        Greenfoot.playSound("medkit.mp3");
    }
}
}

