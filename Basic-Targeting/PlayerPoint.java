public class PlayerPoint extends Point
{
    public PlayerPoint()
    {
        this.x = 200;
        this.y = 200;
    }

    public void moveLeft()
    {
        if (x>0)
        {
            x--;
            pauseFor(100);
        }
    }
    public void moveRight()
    {
        if (x<400)
        {
            x++;
            pauseFor(100);
        }
    }
    public void moveUp()
    {
        if (y>0)
        {
            y--;
            pauseFor(100);
        }
    }
    public void moveDown()
    {
        if (y<400)
        {
            y++;
            pauseFor(100);
        }
    }
    private void pauseFor(int ms)
    {
        try {
            Thread.sleep(ms); // Sleep for ms milliseconds (multiply by 1000 for seconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
