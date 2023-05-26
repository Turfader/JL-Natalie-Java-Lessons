
public class DriverTarget
{
    public static void main(String[] args) 
    {
        PlayerPoint playerPoint = new PlayerPoint();
        Point targetPoint = new Point();
        while(true)
        {
            if(playerPoint.getX() == targetPoint.getX() && playerPoint.getY() == targetPoint.getY())
            {
                targetPoint = new Point();
            }
            /* Add your code here. Do not change anything in the point class or player point subclass.
            Your goal is to write code using class functions, ex. playerPoint.moveRight(), that will move to 
            align the player point with the goal point. You are free to use google to your heart's content.
            Remember, because PlayerPoint is a subclass of Point, it inherits the functions of its parent.
            This means that you can use the getX(), getY(), and printPos() functions on a PlayerPoint object.*/

            // For this project, avoid using loops. You should use if and else if conditionals
        }

    }
}
