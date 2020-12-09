//ZShape class
package tetris.shapes;

import java.awt.Color;

public class ZShape extends Shape
{
    public ZShape(int startX, int startY)
    {
        super(startX, startY);
        c1 = colors[3];
        Brick[] bricks = super.getBricks();
        bricks[0].setColor(c1);
        bricks[1] = new Brick(startX, startY-1, getColor());
        bricks[2] = new Brick(startX-1, startY-1, getColor());
        bricks[3] = new Brick(startX-1,startY-2, getColor());
    }

    //    |_|
    //  |_|_|
    //  |_|
}
