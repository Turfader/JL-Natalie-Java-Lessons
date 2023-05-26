
import java.util.Random;

public class Point 
{
    int x;
    int y;
    public Point()
    {
        this.x = generateNew();
        this.y = generateNew();
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }


    private int generateNew()
    {
        Random random = new Random();
        int newRand = random.nextInt(400);
        return newRand;
    }

    public void printPos()
    {
        System.out.println("X: "+this.x+" Y: "+this.y);
    }

}
