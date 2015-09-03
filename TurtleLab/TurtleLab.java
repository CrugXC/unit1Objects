import java.awt.Color;

public class TurtleLab
{
    public static void main(String[]args)
    throws InterruptedException
    {
        World turtleWorld = new World(1000, 1000);
        
        Picture worldPic = new Picture("C:\\Users\\jtrixie\\Downloads\\Nic#1.jpg");
        turtleWorld.setPicture(worldPic);
        Turtle t1 = new Turtle(turtleWorld);
        Turtle t2 = new Turtle(turtleWorld);
        
        t1.setHeight(1000);
        t2.setHeight(1000);
        
        t1.setBodyColor(Color.BLUE);
        t2.setBodyColor(Color.RED);
        
        t1.setPenColor(Color.RED);
        t2.setPenColor(Color.RED);
        
        t1.setPenWidth(1);
        t2.setPenWidth(1);
        
        t2.turn(180);
        
        t1.penDown();
        t2.penDown();
        
        Color[] colors = { Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA };
        
        int loopVal = 0;
        int totalLoop = 0;
        while (totalLoop != 550)
        {
            Thread.sleep(1);
            
            t1.forward(totalLoop);
            t2.forward(totalLoop);
            
            t1.turn(10);
            t2.turn(10);
            
            t1.forward(totalLoop);
            t2.forward(totalLoop);
            
            t1.turn(10);
            t2.turn(10);
            
            t1.forward(totalLoop);
            t2.forward(totalLoop);
            
            t1.setPenColor(colors[loopVal]);
            t2.setPenColor(colors[loopVal]);
            
            loopVal += 1;
            totalLoop += 1;
            
            t1.setPenWidth(totalLoop);
            t2.setPenWidth(totalLoop);
            if (loopVal == 5)
            {
                loopVal = 0;
            }
        }
    }
}