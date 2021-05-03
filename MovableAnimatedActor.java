import mayflower.*;

public class MovableAnimatedActor extends AnimatedActor
{
    private Animation walkRight;
    private Animation walkLeft;
    private Animation idleL;
    private Animation idleR;
    private Animation fallL;
    private Animation fallR;
    private boolean dir;
    private String currentAction;
    public MovableAnimatedActor()
    {
        walkRight=null;
        walkLeft=null;
        idleL=null;
        idleR=null;
        fallL=null;
        fallR=null;
        currentAction=null;
        dir=false;
    }
    
    public void act()
    {
        super.act();
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        String newAction="idle";
        
        if(currentAction==null)
            newAction="idleL";

        
        if(dir)
            newAction="idleL";
        else
            newAction="idleR";
        
        if (Mayflower.isKeyDown( Keyboard.KEY_UP ) && y > 0)        
        {
            //move(1);
            //setLocation (x, y - 1);
            if(!dir)
            newAction="walkLeft";
            else
            newAction="walkRight";
        } 
        if (Mayflower.isKeyDown( Keyboard.KEY_DOWN ) && y < 600 - h)        
        {
            //move(1);
            //setLocation (x, y + 1);
            if(!dir)
            newAction="walkLeft";
            else
            newAction="walkRight";
        }
        if (Mayflower.isKeyDown( Keyboard.KEY_RIGHT ) && x < 800 - w)        
        {
            //move(1);
            //setLocation (x + 1, y);
            newAction="walkRight";
            dir=true;
            // if(this.isBlocked())
            // {
                // setLocation (x - 1, y);
            // }
        } 
        if (Mayflower.isKeyDown( Keyboard.KEY_LEFT ) && x > 0)        
        {
            //move(1);
            //setLocation (x - 1, y);
            newAction="walkLeft";  
            dir=false;
            // if(this.isBlocked())
            // {
                // setLocation (x + 1, y);
            // }
        } 
        
        if(newAction!=null&&!newAction.equals(currentAction))
        {
            if(newAction.equals("idleL"))
            {
                setAnimation(idleL);
                currentAction=newAction;
            }
            if(newAction.equals("idleR"))
            {
                setAnimation(idleR);
                currentAction=newAction;
            }
            else if(newAction.equals("walkRight"))
            {
                setAnimation(walkRight);
                currentAction=newAction;
            }
            else if(newAction.equals("walkLeft"))
            {
                setAnimation(walkLeft);
                currentAction=newAction;
            }
            else if(newAction.equals("fallL"))
            {
                setAnimation(fallL);
                currentAction=newAction;
            }
            else if(newAction.equals("fallR"))
            {
                setAnimation(fallR);
                currentAction=newAction;
            }
        }
    }

    public void setAnimation(Animation a)
    {
        super.setAnimation(a);
    }
    
    public void setWalkRightAnimation(Animation aniR)
    {
        walkRight=aniR;
        walkRight.setBounds(11, 5, 36, 53);
    }
    
    public void setWalkLeftAnimation(Animation aniL)
    {
        walkLeft=aniL;
        walkLeft.mirrorHorizontally();
        walkLeft.setBounds(18, 5, 36, 53);
    }
    
    public void setIdleLAnimation(Animation aniI)
    {
        idleL=aniI;
        idleL.setBounds(11, 5, 36, 53);
    }
    
    public void setIdleRAnimation(Animation aniI)
    {
        idleR=aniI;
        idleR.mirrorHorizontally();
        idleR.setBounds(18, 5, 36, 53);
    }
    
    public void setFallLAnimation(Animation aniF)
    {
        fallL=aniF;
        //fallL.setBounds(13, 0, 54, 80);
    }
    
    public void setFallRAnimation(Animation aniF)
    {
        fallR=aniF;
        fallR.mirrorHorizontally();
        //fallR.setBounds(32, 0, 54, 80);
    }
    
    public String getCurrentAction()
    {
       return currentAction; 
    }
}
