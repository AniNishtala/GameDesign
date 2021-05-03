import mayflower.*;
public class Animation
{
    private MayflowerImage[] frames;
    private int framerate;
    private int currentFrame;

    public Animation(int animationFrameRate, String[] pictures)
    {
        framerate = animationFrameRate;
        frames = new MayflowerImage[pictures.length];
        for(int i=0; i<pictures.length; i++)
        {
            frames[i]=new MayflowerImage(pictures[i]);
            frames[i].scale(67, 58);
        }
    }

    public int getFrameRate()
    {
        return framerate;
    }

    public MayflowerImage getNextFrame() 
    {
        MayflowerImage nextFrame = frames[currentFrame];
        currentFrame += 1;
        if (currentFrame%frames.length == 0)
            currentFrame = 0;
        return nextFrame;
    }
    
    public void mirrorHorizontally()
    {
       for(int i=0; i<frames.length; i++)
        {
            frames[i].mirrorHorizontally();
        } 
    }
    
    public void setBounds(int x, int y, int w, int h)
    {
        for(int i=0; i<frames.length; i++)
        {
            frames[i].crop(x,y,w,h);
        } 
    }
}
