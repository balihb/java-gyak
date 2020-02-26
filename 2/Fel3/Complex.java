public class Complex {
    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public Complex add(Complex other) {
        return new Complex(other.re + re, other.im + this.im);
    }

    public Complex sub(Complex other) {
        return new Complex(other.re - re, other.im - this.im);
    }

    public Complex mul(Complex other) {
        return new Complex(re * other.re - im * other.im, re * other.im + im * other.re);
    }

    public String toString() {
        return String.format("re: %s, im: %s", re, im);
    }
}
