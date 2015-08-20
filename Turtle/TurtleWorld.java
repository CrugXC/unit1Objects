import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setBodyColor(Color.PINK);
        turtle.penDown();
        turtle.forward(50);
        turtle.turnLeft();
        turtle.forward(80);
        turtle.setPenColor(Color.GREEN);
        turtle.turnRight();
        turtle.forward(100);
        turtle.turn(180);
        turtle.setPenColor(Color.BLUE);
        turtle.forward(200);
        turtle.penUp();
        turtle.turnLeft();
        turtle.forward(100);
        turtle.setPenWidth(17490283);
        turtle.penDown();
        turtle.forward();
    }
}
