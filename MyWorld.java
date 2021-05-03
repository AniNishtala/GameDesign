import mayflower.*;

public class MyWorld extends World 
{
    private Cat cat;
    private Map map;
    private BattleMenu battle;
    public static boolean battleTrig;
    public MyWorld() 
    {
        battleTrig=false;
        setBackground("img/BG/BG.png");
        Mayflower.showBounds(true);
        cat = new Cat();
        map = new Map();
        battle = new BattleMenu();
        addObject(map, -3000, -2000);
        addObject(cat, 400, 250);
    }
    
    public void act()
    {
        if(battleTrig)
        {
            trigger();
        }
    }
    
    private void trigger()
    {
        battle = new BattleMenu();
        addObject(battle, 0, 0);
    }
}