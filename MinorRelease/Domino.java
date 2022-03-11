import java.awt.Color;

public class Domino
{
    private Color tile1Color, tile2Color;
    private int numOfCrowns, numericalVal;
    private int tile1x, tile1y, tile2x, tile2y;


    public Domino(Color tile1Color, Color tile2Color, int numOfCrowns, int numericalVal)
    {
        this.tile1Color = tile1Color;
        this.tile2Color = tile2Color;
        this.numOfCrowns = numOfCrowns;
        this.numericalVal = numericalVal;
        tile1x = 0;
        tile1y = 0;
        tile2x = 0;
        tile2y = 0;

    }
}