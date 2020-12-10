public class MathUtils {
		public static int Increment(int x) {
			if(Integer.MAX_VALUE == x) {
				return x;
			} else {
				return x+1;
			}
		}
}
