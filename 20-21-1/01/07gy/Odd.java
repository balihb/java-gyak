// ez nem a javitott gyakorlo feladat, csak a feladat 1-1-es masolata

class Odd {
    public static void main( String[] args ){
        if( args.length != 1 ){
            System.err.println("Adjon meg pontosan egy számot a parancssorban!");
        } else {
            int num = Integer.parseInt(args[0]);
            String answer = (num % 2 == 1) ? "páratlan" : "páros";
            System.out.println( answer );
        }
    }
}
