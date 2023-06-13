package ua.bykadoroff.hw15;

public class Box {

    private double volume;

    public double getVolume() {
        return volume;
    }

    public Box(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "\n" + "Box{" + "volume=" + volume + '}';

    }
}
