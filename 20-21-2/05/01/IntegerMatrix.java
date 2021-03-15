public class IntegerMatrix {
    private final int rowNum;
    private final int colNum;
    private final int[] linearData;

    public IntegerMatrix(int rowNum, int colNum, int[] linearData) {
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.linearData = linearData;
    }

    public static void main(String[] args) {
        int[] linearData = {1,2,3,4,5,6};
        IntegerMatrix im = new IntegerMatrix(2, 3, linearData);
        System.out.println(im);
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
}
