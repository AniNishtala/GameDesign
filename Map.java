import mayflower.*;

public class Map extends Actor
{
    private MayflowerImage map=new MayflowerImage("img/BG/chronoMap.png");
    private BattleMenu battle;
    public Map()
    {
        map.scale(6912,4590);
        setImage(map);
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        int encount = 0;
        battle = new BattleMenu();
        if (Mayflower.isKeyDown( Keyboard.KEY_UP ))        
        {
            //move(1);
            setLocation (x, y + 3);
            encount+=1;
        } 
        if (Mayflower.isKeyDown( Keyboard.KEY_DOWN ))        
        {
            //move(1);
            setLocation (x, y - 3);
            encount+=1;
        }
        if (Mayflower.isKeyDown( Keyboard.KEY_RIGHT ))        
        {
            //move(1);
            setLocation (x - 3, y);
            encount+=1;
        } 
        if (Mayflower.isKeyDown( Keyboard.KEY_LEFT ))        
        {
            //move(1);
            setLocation (x + 3, y);
            encount+=1;
        } 
        if(encount>=6)
        {
            World world = getWorld();
            world.addObject(battle, 0, 0);
        }
    }
}
