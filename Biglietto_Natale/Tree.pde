public class Tree
{
    private int xLoc, yLoc;
    private color c;
    
    public Tree()
    {
        xLoc = 300;
        yLoc = 430;
        c = color(0,187,45);
    }
    
    public void drawMe()
    {
       
        fill(141,91,5);
        rect(xLoc - 22.5, yLoc + 350, 45, 900); 
        fill(c);
        triangle(xLoc, yLoc, xLoc - 100, yLoc + 200, xLoc + 100, yLoc + 200);
        triangle(xLoc, yLoc+100, xLoc - 130, yLoc + 300, xLoc + 130, yLoc + 300);
        triangle(xLoc, yLoc+200, xLoc - 160, yLoc + 400, xLoc + 160, yLoc + 400);
    }
}
