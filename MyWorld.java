
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int skor = 0;
    private int nyawa = 3;
    private GreenfootSound music = new GreenfootSound("The_Farmer_In_The_Dell_Instrumental.mp3");
    
    private void prepare(){
        lantai lantai = new lantai();
        addObject(lantai,500,500);
        charActor actor = new charActor();
        addObject(actor,480,450);
        music.playLoop();
    }

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1);
        prepare();  
    }
    
    public void act(){
        showText("Nyawa: " + nyawa, 90, 70);
        showText("Uang Terkumpul: Rp." + skor, 150, 20);
        spawnUang();
        spawnBom();
        spawnMedkit();
        if (nyawa == 0){
            gameOver();
        }
    }
    
    public void tambahSkor(){
        skor = skor + 50000;
    }
    
    public void tambahNyawa(){
        nyawa = nyawa + 1;
    }
    
    public void kurangNyawa(){
        nyawa = nyawa - 1;
    }
    
    public void spawnUang()
    {
    if(Greenfoot.getRandomNumber(100) == 1)
    {
     
    int x = Greenfoot.getRandomNumber(getWidth());
     
    addObject(new hudUang(), x, 0);
}
}
    
    public void spawnBom()
    {
    if(Greenfoot.getRandomNumber(300) == 1)
    {
     
    int x = Greenfoot.getRandomNumber(getWidth());
     
    addObject(new hudBom(), x, 0);
}
    }
    
    public void spawnMedkit()
    {
    if(Greenfoot.getRandomNumber(600) == 1)
    {
     
    int x = Greenfoot.getRandomNumber(getWidth());
     
    addObject(new hudMedkit(), x, 0);
}
    }
    
    public void gameOver()
    {
     removeObjects(getObjects(null));
     showText("GAME OVER", getWidth()/2, getHeight()/2);
     showText("Uang Terkumpul: Rp." + skor, getWidth()/2, 300);
    }
    
     
}

