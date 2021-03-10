

class Rectangle {
    double x, y;
    double width, height;

    Point topLeft(){
        Point p = new Point();
        p.x = width >= 0 ? x : x + width;
        p.y = height >= 0 ? y + height : y;
        return p;
    }

    Point topRight(){
        Point p = new Point();
        p.x = width >= 0 ? x + width : x;
        p.y = height >= 0 ? y + height  : y;
        return p;
    }

    Point bottomLeft(){
        Point p = new Point();
        p.x = width >= 0 ? x : x + width;
        p.y = height >= 0 ? y : y + height;
        return p;
    }

    Point bottomRight(){
        Point p = new Point();
        p.x = width >= 0 ? x + width : x;
        p.y = height >= 0 ? y : y + height;
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
    
            if( bottomLeft.x > currentBottomLeft.x ){
                bottomLeft.x = currentBottomLeft.x;
            }
            if( bottomLeft.y > currentBottomLeft.y ){
                bottomLeft.y = currentBottomLeft.y;
            }
            if( topRight.x < currentTopRight.x ){
                topRight.x = currentTopRight.x;
            }
            if( topRight.y < currentTopRight.y ){
                topRight.y = currentTopRight.y;
            }
        }
    	System.out.println( "Bounding rectangle: " + bottomLeft.x + ";" + bottomLeft.y + " - " + topRight.x + ";" + topRight.y );
    }
}


