package person;

import java.util.Objects;

public class TwoStr {
    public String str1;
    public String str2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwoStr twoStr = (TwoStr) o;
        return Objects.equals(str1, twoStr.str1) &&
                Objects.equals(str2, twoStr.str2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str1, str2);
    }
}
