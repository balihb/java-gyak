import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VectorTest2 {
    @Test
    public void isReflexive() {
        Vector v = new Vector(1, 5);
        assertTrue(v.equals(v));
    }

    @Test
    public void isSymetric() {
        Vector v1 = new Vector(1,3);
        Vector v2 = new Vector(1,3);
        assertTrue(v1.equals(v2) && v2.equals(v1));
    }

    @Test
    public void isTransitive() {
        Vector v1 = new Vector(1,3);
        Vector v2 = new Vector(1,3);
        Vector v3 = new Vector(1,3);
        assertTrue(v1.equals(v2) && v2.equals(v3) && v1.equals(v3));
    }

    @Test
    public void notEqualNull() {
        Vector v1 = new Vector(1,3);
        Vector v2 = null;
        assertFalse(v1.equals(null));
    }

    @Test(expected = NullPointerException.class)
    public void nullFails() {
        Vector v1 = null;
        Vector v2 = new Vector(1,3);
        v1.equals(v2);
    }

    @Test
    public void equalsHashCodeEquals() {
        Vector v1 = new Vector(1,3);
        Vector v2 = new Vector(1,3);
        assertTrue(v1.hashCode() == v2.hashCode());
    }
}
