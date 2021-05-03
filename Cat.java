import mayflower.*;

public class Cat extends MovableAnimatedActor
{
    private Animation walkRight;
    private Animation idleL;
    private Animation idleR;
    private Animation fallL;
    private Animation fallR;
    private Animation walkLeft;
    public Cat() 
    {
        String[] images = new String[10];

        for (int i=0; i<10; i++)
        {
            int index = i+1;
            images[i] = "img/cat/Walk (" + (index) + ").png";
        }
        walkRight = new Animation(50, images);
        setWalkRightAnimation(walkRight);
        walkLeft = new Animation(50, images);
        setWalkLeftAnimation(walkLeft);
        for (int j=0; j<10; j++)
        {
            int index = j+1;
            images[j] = "img/cat/Idle (" + (index) + ").png";
        }
        idleL = new Animation(50, images);
        setIdleLAnimation(idleL);
        idleR = new Animation(50, images);
        setIdleRAnimation(idleR);
        images = new String[8];
        for (int j=0; j<8; j++)
        {
            int index = j+1;
            images[j] = "img/cat/Fall (" + (index) + ").png";
        }
        fallL = new Animation(50, images);
        setFallLAnimation(fallL);
        fallR = new Animation(50, images);
        setFallRAnimation(fallR);
    }

    public void act()
    {
        super.act();
    }
}