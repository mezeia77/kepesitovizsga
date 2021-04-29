package hu.nive.ujratervezes.kepesitovizsga.jurassic;

public class Dinosaur {
    private String name;
    private int expected;
    private int actual;

    public Dinosaur(String name, int expected, int actual) {
        this.name = name;
        this.expected = expected;
        this.actual = actual;
    }

    public String getName() {
        return name;
    }

    public int getExpected() {
        return expected;
    }

    public int getActual() {
        return actual;
    }

    @Override
    public String toString() {
        return "Dinosaur{" +
                "name='" + name + '\'' +
                ", expected=" + expected +
                ", actual=" + actual +
                '}';
    }
}
