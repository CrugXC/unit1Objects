import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setBodyColor(Color.PINK);
        turtle.penDown();
        Thread.sleep(1000);
        
        while(1 == 1)
        {
            turtle.forward(3);
            turtle.turn(1);
            Thread.sleep(10);
          
        }
    }
}
