import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableStringArray {
    private final String[] strArr;

    public UnmodifiableStringArray(String[] strArr) {
        this.strArr = Arrays.copyOf(strArr, strArr.length); //defenzív másolás
    }

    public UnmodifiableStringArray empty() {
        return new UnmodifiableStringArray(new String[0]);
    }

    public String get(int index) {
        if (index < 0 || index >= strArr.length) {
            throw new IllegalArgumentException();
        }
        return strArr[index];
    }

    public String find(String str) {
        if (contains(str)) {
            return str;
        } else {
            return null;
        }
    }

    public boolean contains(String str) {
        for (String string : strArr) {
            if (string.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String[] sort() {
        List<String> strList = Arrays.asList(strArr);
        Collections.sort(strList);
        // nem működik: no suitable method found for toArray(String[]::new)
        //return strList.toArray(String[]::new);
        return strList.toArray(new String[strList.size()]);
    }

    public String[] sortArrayOnly() {
        String[] copyArray = Arrays.copyOf(strArr, strArr.length);
        Arrays.sort(copyArray);
        return copyArray;
    }

    public String[] getAllItems() {
        return Arrays.copyOf(strArr, strArr.length); //defenzív másolás
    }

    public int size() {
        return strArr.length;
    }

    public int maxLength() {
        int maxl = -1;
        for (String string : strArr) {
            if (string.length() > maxl) {
                maxl = string.length();
            }
        }
        return maxl;
    }

    public int minLength() {
        int minl = Integer.MAX_VALUE;
        for (String string : strArr) {
            if (string.length() < minl) {
                minl = string.length();
            }
        }
        return minl;
    }

    public int allLength() {
        int sum = 0;
        for (String string : strArr) {
            sum += string.length();
        }
        return sum;
    }
}