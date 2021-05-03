import mayflower.*;

public class AnimatedActor extends GravityActor 
{
    private Animation animation;
    private Timer animationTimer;

    public AnimatedActor() 
    {
        animation = null;
        animationTimer = new Timer(1000);
    }

    public void setAnimation(Animation a)
    {
        animation = a;
        animationTimer.reset();
    }

    public void act()
    {
        if(animation != null)
        {
            if (animationTimer.isDone() )
            {
                MayflowerImage nextFrame = animation.getNextFrame();
                setImage(nextFrame);
                animationTimer.reset();
            }
            super.act();
        }
    }

}