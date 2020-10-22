public class Main {
    public static void main(String[] args) {
        int[] linearData = {1, 2, 3, 4, 5, 6};
		System.out.println("before");
        IntegerMatrix lm = new IntegerMatrix(2, 3, linearData);
		System.out.println("after lm");
		IntegerMatrix lm2 = null;
		try {
			lm2 = new IntegerMatrix(-2, 3, linearData);
		} catch (IllegalArgumentException ex) { 
			System.out.println("no good iae");
		} catch (Exception ex) {
			System.out.println("no good");
		} finally {
			System.out.println("mindenkeppen");
		}
		
		System.out.println("after lm2");
        System.out.println(lm);
		
		//try {
			lm.thrower(lm2);
		//} catch (Exception ex) {
			//System.out.println("catched thrower");
		//}
		
		Integer a = 1;
		Integer b = 2;
		
		swap(a,b);
		
		System.out.println(a);
		System.out.println(b);
    }
	
	public static void swap(Integer a, Integer b) {
		Integer c = a;
		a = b;
		b = c;
	}
}
