
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square Sky;
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square grass;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {   
        
        grass = new Square();
        grass.changeColor("green");
        grass.moveVertical(0);
        grass.moveHorizontal(-60);
        grass.changeSize(500);
        grass.makeVisible();
        
        
        
        Sky = new Square();
        Sky.changeColor("black");
        Sky.moveVertical(-350);
        Sky.moveHorizontal(-60);
        Sky.changeSize(500);
        Sky.makeVisible();
        
        
        
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.moveHorizontal(-30);
        wall.makeVisible();
        wall.changeColor("magenta");
        
        
        wall = new Square();
        wall.moveVertical(100);
        wall.changeSize(80);
        wall.moveHorizontal(70);
        wall.changeColor("magenta");
        wall.makeVisible();
        wall.changeColor("magenta");
        
        wall = new Square();
        wall.moveVertical(120);
        wall.changeSize(60);
        wall.moveHorizontal(80);
        wall.changeColor("black");
        wall.makeVisible();
        wall.changeColor("black");

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(37);
        window.moveVertical(100);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(-30);
        window.moveVertical(100);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(5);
        window.moveVertical(150);
        window.makeVisible();
        
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(5);
        window.moveVertical(135);
        window.makeVisible();
        

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(30);
        roof.moveVertical(70);
        roof.makeVisible();
        roof.changeColor("red");

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(110);
        sun.moveVertical(-10);
        sun.changeSize(15);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(60);
        sun.moveVertical(-30);
        sun.changeSize(15);
        sun.makeVisible();
        
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(30);
        sun.moveVertical(-48);
        sun.changeSize(7);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(145);
        sun.moveVertical(-40);
        sun.changeSize(0);
        sun.makeVisible();
        
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(165);
        sun.moveVertical(-50);
        sun.changeSize(10);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(0);
        sun.moveVertical(-60);
        sun.changeSize(0);
        sun.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
