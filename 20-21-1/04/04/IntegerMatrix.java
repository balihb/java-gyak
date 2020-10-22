public class IntegerMatrix {
	private final int rowNum;
    private final int colNum;
    private final int[] linearData;

	public IntegerMatrix(int rowNum, int colNum, int[] linearData) {
		if(rowNum <= 0 || colNum <= 0) {
			throw new IllegalArgumentException();
		}
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.linearData = linearData;
    }
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
				if(i != 0 && j == 0) {
					sb.append(";");
				}
				sb.append(linearData[(i * (colNum - 1)) + j]);
				if (j != colNum - 1) {
					sb.append(",");
				}
			}
		}
		
		return sb.toString();
	}
	
	public void thrower(IntegerMatrix lm){
		System.out.println(lm.toString());
		
	}
}