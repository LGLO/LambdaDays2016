package immutable;

public class Rational {

    public final long n;
    public final long d;

    public Rational(long n, long d) {
        this.n = n;
        this.d = d;
    }

    static public Rational integer(long n) {
        return new Rational(n, 1L);
    }

    @Override
    public String toString() {
        return n + "/" + d;
    }

    public Rational add(Rational o) {
        return new Rational(n * o.d + o.n * d, d * o.d);
    }

    public Rational div(Rational a) {
        if (a.n == 0L) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return new Rational(n * a.d, d * a.n);
    }

    public Rational divNull(Rational a) {
        return (a.n == 0L) ?
                null :
                new Rational(n * a.d, d * a.n);
    }
}
