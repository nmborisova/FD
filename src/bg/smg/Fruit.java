package bg.smg;

public class Fruit extends Food implements Comparable<Fruit>{
    private boolean isReadyToEat;

    public Fruit(String name, double kg, boolean isReadyToEat) {
        super(name, kg);
        this.isReadyToEat = isReadyToEat;
    }

    public Fruit(String name, double kg) {
        super(name, kg);
    }

    public Fruit(boolean isReadyToEat) {
        this.isReadyToEat = isReadyToEat;
    }

    public Fruit() {
        this.isReadyToEat = true;
    }

    public boolean isReadyToEat() {
        return isReadyToEat;
    }

    public void setReadyToEat(boolean readyToEat) {
        isReadyToEat = readyToEat;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(Fruit o) {
        return 0;
    }
}
