/*
téglalap egyik csúcsa, hozzá képest magasság szélesség
a téglalap csúcsait pontként
főprogram parancssori arg téglalapokat kap: [x y w h ...]
létrehozza a Rectangle-ket
befoglaló Rectangle: az a legkisebb Rectangle, amely az összes Rectangle-t tartalmazza
*/

class Rectangle {
    double x, y;
    double width, height;

    Point topLeft(){
        Point p = new Point();
        p.x = Double.min( x, x + width );
        p.y = Double.max( y, y + height );
        return p;
    }

    Point topRight(){
        Point p = new Point();
        p.x = Double.max( x, x + width );
        p.y = Double.max( y, y + height );
        return p;
    }

    Point bottomLeft(){
        Point p = new Point();
        p.x = Double.min( x, x + width );
        p.y = Double.min( y, y + height );
        return p;
    }

    Point bottomRight(){
        Point p = new Point();
        p.x = Double.max( x, x + width );
        p.y = Double.min( y, y + height );
        return p;
    }
}

class Main
{
    public static void main(String[] args)
    {
        if( args.length < 4 ){
            System.out.println("Too few arguments, at least 4 numbers are needed.");
            return;
        }

        Rectangle first = new Rectangle();
        first.x = Double.parseDouble(args[0]);
        first.y = Double.parseDouble(args[1]);
        first.width = Double.parseDouble(args[2]);
        first.height = Double.parseDouble(args[3]);

        Point bottomLeft = first.bottomLeft();
        Point topRight = first.topRight();

        for (int i = 4; i+3 < args.length; i += 4)
        {
            Rectangle curr = new Rectangle();
            curr.x = Double.parseDouble(args[i]);
            curr.y = Double.parseDouble(args[i+1]);
            curr.width = Double.parseDouble(args[i+2]);
            curr.height = Double.parseDouble(args[i+3]);

            Point currentBottomLeft = curr.bottomLeft();
            Point currentTopRight = curr.topRight();
    
	    bottomLeft.x = Double.min( bottomLeft.x, currentBottomLeft.x );
	    bottomLeft.y = Double.min( bottomLeft.y, currentBottomLeft.y );
	    topRight.x = Double.max( topRight.x, currentTopRight.x );
	    topRight.y = Double.max( topRight.y, currentTopRight.y );
        }
    	System.out.println( "Bounding rectangle: " + bottomLeft.x + ";" + bottomLeft.y + " - " + topRight.x + ";" + topRight.y );
    }
}


