package by.gsu.epamlab;

public class Byn implements Comparable<Byn> {

    private int value;

    public Byn(int value) {
        this.value = value;
    }

    public Byn(int rubs, int coins) {
        this(rubs * 100 + coins);
    }

    public Byn(Byn value) {
        this(value.getValue());
    }

    @Override
    public String toString() {
        int integer = value / 100;
        int tenths = (value % 100) / 10;
        int hundredths = value % 10;

        return integer + "." + tenths + hundredths;
    }

    public Byn add(Byn byn) {
        this.value += byn.getValue();
        return this;
    }

    public Byn sub(Byn byn) {
        this.value -= byn.getValue();
        return this;
    }

    public Byn mul(int k) {
        this.value *= k;
        return this;
    }

    public Byn mul(double k) {
        this.value = (int) Math.round((double) this.value * k);
        return this;
    }

    public Byn div(double k) {
        return mul(1.0 / k);
    }

    public Byn div(int k) {
        return div((double) k);
    }

    public int getValue() {
        return value;
    }

    public int getRubs() {
        return value / 100;
    }

    public int getCoins() {
        return value % 100;
    }

    public enum Round {
        TO_UP {
            int round(Byn amount) {
                return roundUp(amount);
            }
        },
        TO_DOWN {
            int round(Byn amount) {
                return roundDown(amount);
            }
        },
        TO_INTEGER {
            int round(Byn amount) {
                return roundInteger(amount);
            }
        };

        abstract int round(Byn amount);
    }

    private static int roundUp(Byn amount) {
        int coins = amount.getCoins() > 0 ? 100 : 0;
        return amount.getRubs() * 100 + coins;
    }

    private static int roundDown(Byn amount) {
        return amount.getRubs() * 100;
    }

    private static int roundInteger(Byn amount) {
        int coins = amount.getCoins() >= 50 ? 100 : 0;
        return amount.getRubs() * 100 + coins;
    }

    public void round(Round round) {
        this.value = round.round(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Byn byn = (Byn) o;
        return value == byn.value;
    }

    @Override
    public int compareTo(Byn byn) {
        return value - byn.getValue();
    }

}
