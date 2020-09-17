class Skip {
    public static void main( String[] args ){
		
	// https://bead.inf.elte.hu/files/java/api/java.base/java/io/Console.html#readLine()
		String myLine = System.console().readLine();
		System.console().printf("Hello %s", myLine);
    }
}
