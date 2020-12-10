import java.util.Arrays;

public class IntegerMatrix {
    private final int rowNum;
    private final int colNum;
    private final int[] linearData;
    private ToStringSelector ts = ToStringSelector.STRBUFF2;

    public IntegerMatrix(int rowNum, int colNum, int[] linearData) {
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.linearData = linearData;
    }

    public IntegerMatrix(int rowNum, int colNum, int[] linearData, ToStringSelector ts) {
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.linearData = linearData;
        this.ts = ts;
    }

    @Override
    public String toString() {
        switch (ts) {
            case STRBUFF:
                return toStringStrBuff();
            case STRBUFF2:
                return toStringStrBuff2();
            default:
                return toStringGenerated();
        }
    }

    private String toStringGenerated() {
        return "IntegerMatrix{" +
                "rowNum=" + rowNum +
                ", colNum=" + colNum +
                ", linearData=" + Arrays.toString(linearData) +
                '}';
    }

    private String toStringStrBuff() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (j == 0) {
                    sb.append("[");
                }
                sb.append(linearData[(i * (colNum - 1)) + j]);
                if (j == colNum - 1) {
                    sb.append("]");
                    sb.append(System.lineSeparator());
                } else {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }

    private String toStringStrBuff2() {
        StringBuffer sb = new StringBuffer();
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
